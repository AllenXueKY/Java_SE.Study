package com.socket;
/**
 * 服务器端线程处理类
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
	//和本线程相关的Socket
	Socket socket = null;

	public ServerThreadDemo(Socket socket) {
		this.socket = socket;
	}
	
	//线程执行的操作，响应客户端的请求
	@Override
	public void run() {
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		OutputStream outputStream = null;
		PrintWriter printWriter = null;
		try {
			//获取输入流用来读取客户端信息
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//循环读取客户端的信息
				System.out.println("我是服务器，客户端说：" + infor);
			}
			socket.shutdownInput();
			//获取输入流，响应客户端的请求
			outputStream = socket.getOutputStream();
			printWriter = new PrintWriter(outputStream);
			printWriter.write("欢迎您！");
			printWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//5.关闭相关资源
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
