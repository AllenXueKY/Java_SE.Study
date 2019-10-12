package com.javabase.concurrent.base;
/**
 * ���ӽ��� -- ģ��˫����ս����Ϊ
 * @author 87366
 *
 */
public class ArmyRunnable implements Runnable {
	//volatile��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	//�ɼ��� JMM �� happens-beforeԭ��
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while (keepRunning) {
			//����������
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "�����Է�[" + i + "]");
				//�ó��˴�����ʱ�䣬�´θ�˭��������һ���أ�
				Thread.yield();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + "������ս����");
	}

}
