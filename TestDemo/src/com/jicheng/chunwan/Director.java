package com.jicheng.chunwan;
/**
 *������ -- �൱��������Ŀ�еĺ���ҵ����
 * ��Ҫ���ܣ�����Ա��λ����ʼ����
 * @author 87366
 *
 */
public class Director {
	/**
	 * ���ݵġ�Action������������Ա��λ��ʼ���ݽ�Ŀ
	 * @param actor
	 */
	public void action(Actor actor){
		actor.performs();
	}
}