package com.javabase.concurrent.base;

public class KeyPersonThread extends Thread {

	
public void run() {
	System.out.println(Thread.currentThread().getName() + "开始了战斗！");
	for (int i = 0; i < 10; i++) {
		System.out.println(Thread.currentThread().getName() + "突出重围，击杀隋军。。。");
	}
	
	
	
	
		
	System.out.println(Thread.currentThread().getName() + "结束了战斗！");
}
}
