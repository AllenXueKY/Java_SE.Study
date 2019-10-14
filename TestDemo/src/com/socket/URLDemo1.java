package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ʹ��URL��ȡҳ������
 * @author 87366
 *
 */
public class URLDemo1 {

	public static void main(String[] args) {
		InputStream inpStr = null;
		InputStreamReader inpStream = null;
		BufferedReader bufffedReader = null;
		
		try {
			//����һ��URLʵ��
			URL url = new URL("https://www.baidu.com");
			//ͨ��URL��openStream������ȡURL��������ʾ����Դ���ֽ�������
			inpStr = url.openStream();
			//���ֽ�������ת��Ϊ�ַ�������
			inpStream = new InputStreamReader(inpStr , "utf-8");
			//Ϊ�ַ���������ӻ���
			bufffedReader = new BufferedReader(inpStream);
			String dataString = bufffedReader.readLine();//��ȡ����
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
