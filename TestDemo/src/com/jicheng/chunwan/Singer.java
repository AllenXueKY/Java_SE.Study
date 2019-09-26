package com.jicheng.chunwan;
/**
 * 歌唱演员
 * @author 87366
 *
 */
public class Singer extends Actor {

	public Singer() {
		super();
	}

	public Singer(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("歌唱演员" + getName() + "正在表演歌唱节目《在这桃花盛开的地方》");
	}
}
