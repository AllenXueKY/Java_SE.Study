package com.jicheng.rpgdemo;
/**
 * ��ʦ��
 * @author 87366
 *
 */
public class Archmage extends Hero{
	/** սʿ��ľ�̬���ԣ�ÿʵ����һ���µ�չʾ����ID++ -- *������������ĳ���౻ʵ�����Ĵ��� */
	public static int ID = 1;
	
	private int magicAttack;
	
	public Archmage(){
		setNickName("Ĭ�Ϸ�ʦ" + ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Archmage(String nickName){
		this();//���ñ����Ĭ�Ϲ���
		setNickName(nickName);
	}
	
	/**
	 * ��дtoString��������װ��ӡ��ɫ��Ϣ���߼�
	 */
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t\t");
		str.append(getCurrLife());
		str.append("\t");
		str.append(getMagicAttack());
		return str.toString();
	}
	
	public void biubiubiu(){
		System.out.println("��ʦ" + getNickName() + "���ڴ����");
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
