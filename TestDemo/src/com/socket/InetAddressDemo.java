package com.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAddress���Ӧ��
 * @author 87366
 *
 */
public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���������" + address.getHostName());
		System.out.println("IP��ַ��" + address.getHostAddress());
		byte[] bytes = address.getAddress();  //��ȡ�ֽ������IP��ַ
		System.out.println("�ֽ��������ʽ��IP��" + Arrays.toString(bytes));
		System.out.println(address);//ֱ�����InetAddress����
		//���ݻ�������ȡInetAddressʵ��
		//InetAddress address2 = InetAddress.getByName("DESKTOP-KF6VQOG");
		InetAddress address2 = InetAddress.getByName("111.114.38.225");
		System.out.println("���������" + address2.getHostName());
		System.out.println("IP��ַ��" + address2.getHostAddress());
		
	}

}
