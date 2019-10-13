package com.javabase.concurrent.base;

import javax.swing.JInternalFrame;

/**
 * ���������Ϸ��̨
 * @author 87366
 *
 */
public class Stage extends Thread {
	
	public void run() {
		System.out.println("��ӭ�ۿ���������");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("��Ļ��������");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("��˵�峯ĩ�꣬�����ũ�������ɱ�û���ڵء�����");
		
		ArmyRunnable armyTsakOfDynasty = new ArmyRunnable();//�峯����
		ArmyRunnable armyTsakOfRevolt = new ArmyRunnable(); //ũ�������
		//ʹ��Runnable�ӿڴ����߳�
		Thread armyOfDynasty = new Thread(armyTsakOfDynasty,"�峯����");
		Thread armyOfRevolt = new Thread(armyTsakOfRevolt,"ũ�������");
		//�����̣߳���˫����ʼ��ս
		armyOfDynasty.start();
		armyOfRevolt.start();
		//��̨�߳����ߣ����ר�Ĺۿ����ӵ���ɱ
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����˫����ս��������·ɱ������ҧ��");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("��ҧ��");
		System.out.println("��ҧ���������ǽ���ս����ʹ���հ�����ҵ��");
		//ֹͣ������ս
		//ֹͣ�̵߳ķ���
		armyTsakOfDynasty.keepRunning = false;
		armyTsakOfRevolt.keepRunning = false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/**
		 * ��ʷ��Ϸ�����ؼ�����
		 */
		mrCheng.start();
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ս�����������񰲾���ҵ��������ʵ���˻������������룬Ϊ���������˹���");
		System.out.println("лл��ҵĹۿ����ټ���");
		
	}
	
	public static void main(String[] args) {
		new Stage().start();
	}
	
}
