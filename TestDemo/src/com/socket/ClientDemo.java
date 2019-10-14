package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * �ͻ���
 * @author 87366
 *
 */
public class ClientDemo {
	public static void main(String[] args) {	
		Socket socket = null;
		OutputStream outputStream = null;
		PrintWriter printWriter = null;
		BufferedReader bufferedReader = null;
		InputStream inputStream = null;
		try {
			//1.�����ͻ���Socket��ָ���������˿ں͵�ַ
			socket = new Socket("localhost",8888);
			//2.��ȡ��������������������Ϣ
			outputStream = socket.getOutputStream();
			printWriter = new PrintWriter(outputStream);
			printWriter.write("�û�����tom;���룺456");
			printWriter.flush();
			socket.shutdownOutput();
			//3.��ȡ��������������ȡ�������˵���Ӧ��Ϣ
			inputStream = socket.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//ѭ����ȡ�ͻ��˵���Ϣ
				System.out.println("���ǿͻ��ˣ������˵��" + infor);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	
			try {
				//4.�ر������Դ
				bufferedReader.close();
				inputStream.close();				
				printWriter.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
