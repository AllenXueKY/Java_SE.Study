package com.ioStream;
/**
 * ��Ա����
 * @author 87366
 *
 */
public class Actor {//��һ�����ǳ������ʱ�򣬾Ͳ���ʹ��new��ʵ�����ˣ�--�������������ĸ��࣡
	private String name;
	
	public Actor() {
		
	}
	
	public Actor(String name) {
		setName(name);
	}
	/**
	 * ��Ա�ı��ݷ���
	 * @return
	 */
	public void performs() {
		System.out.println("��Ա" + name + "���ڱ��ݾ��ʵĽ�Ŀ");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
