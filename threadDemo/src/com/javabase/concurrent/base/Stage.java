package com.javabase.concurrent.base;

import javax.swing.JInternalFrame;

/**
 * 隋唐演义大戏舞台
 * @author 87366
 *
 */
public class Stage extends Thread {
	
	public void run() {
		ArmyRunnable armyTsakOfDynasty = new ArmyRunnable();//隋朝军队
		ArmyRunnable armyTsakOfRevolt = new ArmyRunnable(); //农民起义军
		//使用Runnable接口创建线程
		Thread armyOfDynasty = new Thread(armyTsakOfDynasty,"隋朝军队");
		Thread armyOfRevolt = new Thread(armyTsakOfRevolt,"农民起义军");
		//启动线程，让双方开始作战
		armyOfDynasty.start();
		armyOfRevolt.start();
		//舞台线程休眠，大家专心观看军队的厮杀
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		armyTsakOfDynasty.keepRunning = false;
		armyTsakOfRevolt.keepRunning = false;
		try {
			armyOfRevolt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("正当双方激战正酣，半路杀出个程咬金");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("程咬金");
		System.out.println("程咬金的理想就是结束战争，使百姓安居乐业！");
		//停止军队作战
		//停止线程的方法
		armyTsakOfDynasty.keepRunning = false;
		armyTsakOfRevolt.keepRunning = false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/**
		 * 历史大戏留给关键人物
		 */
		mrCheng.start();
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Stage().start();
	}
	
}
