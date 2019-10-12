package com.javabase.concurrent.base;
/**
 * 军队进程 -- 模拟双方作战的行为
 * @author 87366
 *
 */
public class ArmyRunnable implements Runnable {
	//volatile保证了线程可以正确的读取其他线程写入的值
	//可见性 JMM ， happens-before原则
	volatile boolean keepRunning = true;

	@Override
	public void run() {
		while (keepRunning) {
			//发动五连击
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
				//让出了处理器时间，下次该谁进攻还不一定呢！
				Thread.yield();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + "结束了战斗！");
	}

}
