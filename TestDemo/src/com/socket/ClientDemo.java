package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
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
			//1.创建客户端Socket，指定服务器端口和地址
			socket = new Socket("localhost",8888);
			//2.获取输出流，向服务器发送消息
			outputStream = socket.getOutputStream();
			printWriter = new PrintWriter(outputStream);
			printWriter.write("用户名：tom;密码：456");
			printWriter.flush();
			socket.shutdownOutput();
			//3.获取输入流，用来读取服务器端的响应信息
			inputStream = socket.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//循环读取客户端的信息
				System.out.println("我是客户端，服务端说：" + infor);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	
			try {
				//4.关闭相关资源
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
