package com.ioStream;
/**
 * 演员父类
 * @author 87366
 *
 */
public class Actor {//当一个类是抽象类的时候，就不能使用new来实例化了！--抽象类是天生的父类！
	private String name;
	
	public Actor() {
		
	}
	
	public Actor(String name) {
		setName(name);
	}
	/**
	 * 演员的表演方法
	 * @return
	 */
	public void performs() {
		System.out.println("演员" + name + "正在表演精彩的节目");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
