package com.jicheng.printdemo;
/**
 * ��ӡ����  - ʹ�ñ�׼��ī�к�ֽ�Ž��д�ӡ
 * @author 87366
 *
 */

import com.jicheng.printdemo.iface.iPaper;
import com.jicheng.printdemo.iface.iinkBox;

public class Printer {
	private iinkBox inkbox; //��ӡ���е�ī��
	private iPaper paper;    //��ӡ���е�ֽ��
	
	/**
	 * ��ӡ���Ĵ�ӡ���� - ʹ��ī�к�ֽ��
	 * @param content ���ݸ���ӡ����ӡ���ַ�������
	 */
	public void print(String content) {
		if (null == inkbox && null == paper) {
			System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ�����ԣ�");
			return;
		}
		//��ӡ����
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("����������" + color + "��ɫ�ģ�");
		System.out.println("ʹ��ֽ�ţ�" + type);
		System.out.println("��ӡ���ݣ�" + content);
	}
	
	
	public iinkBox getIinkbox() {
		return inkbox;
	}
	public void setIinkbox(iinkBox iinkbox) {
		this.inkbox = iinkbox;
	}
	public iPaper getPaper() {
		return paper;
	}
	public void setPaper(iPaper paper) {
		this.paper = paper;
	}
	
}
