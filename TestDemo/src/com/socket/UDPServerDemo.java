package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * �������ˣ�ʵ�ֻ���UDP���û���¼
 * @author 87366
 *
 */
public class UDPServerDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ���տͻ��˷��͵�����
		 */
		//1.������������DatagramSocket��ָ���˿�
		DatagramSocket socket = new DatagramSocket(8889);
		//2.�������ݱ������ڽ��տͻ��˷��͵�����
		byte[] data = new byte[1024];//�����ֽ����飬ָ�����յ����ݰ��Ĵ�С
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//3.���տͻ��˷��͵�����
		System.out.println("****���������Ѿ��������ȴ��ͻ��˷�������****");
		socket.receive(packet);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ����
		//4.��ȡ����
		String infor = new String(data, 0, packet.getLength());
		System.out.println("���Ƿ��������ͻ���˵��" + infor);
		/*
		 * ��ͻ�����Ӧ����
		 */
		//1.����ͻ��˵ĵ�ַ���˿ںš�����
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "��ӭ����".getBytes();
		//2.�������ݱ���������Ӧ��������Ϣ
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		//3.��Ӧ�ͻ���
		socket.send(packet2);
		socket.close();
	}
}
