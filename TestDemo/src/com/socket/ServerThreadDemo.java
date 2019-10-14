package com.socket;
/**
 * ���������̴߳�����
 * @author 87366
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThreadDemo extends Thread {
	//�ͱ��߳���ص�Socket
	Socket socket = null;

	public ServerThreadDemo(Socket socket) {
		this.socket = socket;
	}
	
	//�߳�ִ�еĲ�������Ӧ�ͻ��˵�����
	@Override
	public void run() {
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		OutputStream outputStream = null;
		PrintWriter printWriter = null;
		try {
			//��ȡ������������ȡ�ͻ�����Ϣ
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//ѭ����ȡ�ͻ��˵���Ϣ
				System.out.println("���Ƿ��������ͻ���˵��" + infor);
			}
			socket.shutdownInput();
			//��ȡ����������Ӧ�ͻ��˵�����
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
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}	
}
