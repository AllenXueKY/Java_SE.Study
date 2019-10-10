package com.jicheng.printdemo;
/**
 * 打印机类  - 使用标准的墨盒和纸张进行打印
 * @author 87366
 *
 */

import com.jicheng.printdemo.iface.iPaper;
import com.jicheng.printdemo.iface.iinkBox;

public class Printer {
	private iinkBox inkbox; //打印机中的墨盒
	private iPaper paper;    //打印机中的纸张
	
	/**
	 * 打印机的打印方法 - 使用墨盒和纸张
	 * @param content 传递给打印机打印的字符串内容
	 */
	public void print(String content) {
		if (null == inkbox && null == paper) {
			System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
			return;
		}
		//打印过程
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("以下文字是" + color + "颜色的！");
		System.out.println("使用纸张：" + type);
		System.out.println("打印内容：" + content);
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
