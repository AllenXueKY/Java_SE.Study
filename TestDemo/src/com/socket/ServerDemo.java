package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����TCPЭ���Socketͨ�ţ�ʵ���û���¼
 * ��������
 * @author 87366
 *
 */
public class ServerDemo {
	//������߳�
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//1.����һ����������Socket����ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			serverSocket = new ServerSocket(8888);
			//��¼�ͻ��˵�����
			int count = 0;
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			//ѭ�������ȴ��ͻ��˵�����
			while(true) {
				//����accept()������ʼ�������ȴ��ͻ��˵�����
				socket = serverSocket.accept();
				//����һ���µ��߳�
				ServerThreadDemo serverThreadDemo = new ServerThreadDemo(socket);
				//�����߳�
				serverThreadDemo.start();
				
				count++;//ͳ�ƿͻ��˵�����
				System.out.println("�ͻ��˵�������" + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("�ͻ���" + count + "��IP��ַ��" + address.getHostAddress());
				
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//5.�ر������Դ
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
	
	//��һ���汾
	public static void main1(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		OutputStream outputStream = null;
		PrintWriter printWriter = null;
		try {
			//1.����һ����������Socket����ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			serverSocket = new ServerSocket(8888);
			//2.����accept()������ʼ�������ȴ��ͻ��˵�����
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			socket = serverSocket.accept();
			//3.��ȡ������������ȡ�ͻ�����Ϣ
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//ѭ����ȡ�ͻ��˵���Ϣ
				System.out.println("���Ƿ��������ͻ���˵��" + infor);
			}
			socket.shutdownInput();
			//4.��ȡ����������Ӧ�ͻ��˵�����
			outputStream = socket.getOutputStream();
			printWriter = new PrintWriter(outputStream);
			printWriter.write("��ӭ����");
			printWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//5.�ر������Դ
				printWriter.close();
				outputStream.close();
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
}