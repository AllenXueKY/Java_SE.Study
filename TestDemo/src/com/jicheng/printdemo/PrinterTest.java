package com.jicheng.printdemo;

import com.jicheng.printdemo.impl.A4PaperImpl;
import com.jicheng.printdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//Ϊ��ӡ����װֽ�ź�ī��
		printer.setIinkbox(new ColorInkBoxImpl());
		printer.setPaper(new B5PaperImpl());
		
		printer.print("��������");
	}
}