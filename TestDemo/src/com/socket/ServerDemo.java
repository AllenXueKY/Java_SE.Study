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
 * 基于TCP协议的Socket通信，实现用户登录
 * 服务器端
 * @author 87366
 *
 */
public class ServerDemo {
	//加入多线程
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
			serverSocket = new ServerSocket(8888);
			//记录客户端的数量
			int count = 0;
			System.out.println("***服务器即将启动，等待客户端的连接***");
			//循环监听等待客户端的连接
			while(true) {
				//调用accept()方法开始监听，等待客户端的连接
				socket = serverSocket.accept();
				//创建一个新的线程
				ServerThreadDemo serverThreadDemo = new ServerThreadDemo(socket);
				//启动线程
				serverThreadDemo.start();
				
				count++;//统计客户端的数量
				System.out.println("客户端的数量：" + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("客户端" + count + "的IP地址：" + address.getHostAddress());
				
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//5.关闭相关资源
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
	
	//第一个版本
	public static void main1(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		OutputStream outputStream = null;
		PrintWriter printWriter = null;
		try {
			//1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
			serverSocket = new ServerSocket(8888);
			//2.调用accept()方法开始监听，等待客户端的连接
			System.out.println("***服务器即将启动，等待客户端的连接***");
			socket = serverSocket.accept();
			//3.获取输入流用来读取客户端信息
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String infor = null;
			while ((infor = bufferedReader.readLine()) != null) {//循环读取客户端的信息
				System.out.println("我是服务器，客户端说：" + infor);
			}
			socket.shutdownInput();
			//4.获取输入流，响应客户端的请求
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
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
}
