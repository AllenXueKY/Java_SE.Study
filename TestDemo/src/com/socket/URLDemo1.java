package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 使用URL读取页面内容
 * @author 87366
 *
 */
public class URLDemo1 {

	public static void main(String[] args) {
		InputStream inpStr = null;
		InputStreamReader inpStream = null;
		BufferedReader bufffedReader = null;
		
		try {
			//创建一个URL实例
			URL url = new URL("https://www.baidu.com");
			//通过URL的openStream方法获取URL对象所表示的资源的字节输入流
			inpStr = url.openStream();
			//将字节输入流转换为字符输入流
			inpStream = new InputStreamReader(inpStr , "utf-8");
			//为字符输入流添加缓冲
			bufffedReader = new BufferedReader(inpStream);
			String dataString = bufffedReader.readLine();//读取数据
			while (dataString != null) {
				System.out.println(dataString);
				dataString = bufffedReader.readLine();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufffedReader.close();
				inpStream.close();
				inpStr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
