package com.jicheng.printdemo;

import com.jicheng.printdemo.impl.A4PaperImpl;
import com.jicheng.printdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//为打印机安装纸张和墨盒
		printer.setIinkbox(new ColorInkBoxImpl());
		printer.setPaper(new B5PaperImpl());
		
		printer.print("测试内容");
	}
}
