package com.AllenXue.JavaBase.Homeork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

public class Person {
	private String ID;      //���֤��
	private String Name;  //����
	private String Sex;	  //�Ա�
	private double Stature;  //���
	private double Weight;   //����
	
	/**
	 * �ж����֤��
	 * @param person
	 * @return
	 */
	public boolean isID(Person person) {
		int count = person.ID.length();
		if (count != 18 ) {
			PrintInformations("���֤��");
			return false;
		}else if(!(isIDDate(person))){		
			return false;
		}
		for (int i = 0; i < count - 1; i++) {
			if(!(person.ID.charAt(i) >= '0' && person.ID.charAt(i) <= '9')){
				PrintInformations("���֤��");
				return false;
			}	
		}

		if (!(person.ID.charAt(count-1) >= '0' && person.ID.charAt(count-1) <= '9' 
				|| person.ID.charAt(count-1) == 'x' || person.ID.charAt(count-1) == 'X')){
			PrintInformations("���֤��");
			return false;
		}
		
		return true;
	}
	public boolean isIDDate(Person person) {
		int yyyymmdd = 0;
		for (int i = 6; i < person.ID.length() - 4; i++) {
				yyyymmdd = (person.ID.charAt(i) - 48) + yyyymmdd * 10;
		}
		int yyyy = yyyymmdd /10000;
		int MM = (yyyymmdd - yyyy * 10000) / 100;
		int d = yyyymmdd % 10;          //�յĸ�λ
		int d1 = yyyymmdd % 100 - d;	//�յ�ʮλ
		String yyyyMMdd = String.valueOf(yyyy) + '-' + String.valueOf(MM) + '-' + String.valueOf(d1) + String.valueOf(d);
		if (!person.isValidDate(yyyyMMdd)) {
			PrintInformations("���֤��");
			return false;
		}
		return true;
	}
	
	/**
	 * ���֤�ĳ������ڶ��ж�
	 * @param str
	 * @return
	 */
    public boolean isValidDate(String date)  
    {  
        
        String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";                
        Pattern pat = Pattern.compile(rexp);                  
        Matcher mat = pat.matcher(date);    
        boolean dateType = mat.matches();  
       return dateType;  
    }   
	
	/**
	 * У������
	 */
	public boolean isName(Person person){
		if (person.Name.length() < 2 ) {
			PrintInformations("����");
			return false;
		}
		//�ж��Ƿ��з���
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(person.Name.contains(Character.toString(ch))){
				PrintInformations("����");
				return false;
			}
		}
		//�ж��Ƿ�������
		for (int j = 0; j < person.Name.length(); j++) {
			if(person.Name.charAt(j) >= '0' && person.Name.charAt(j) <= '9' 
					|| person.Name.charAt(j) >= 'a' && person.Name.charAt(j) <= 'z' 
					|| person.Name.charAt(j) >= 'A' && person.Name.charAt(j) <= 'Z' ) {
				PrintInformations("����");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �ж��Ա�
	 */
	public boolean isSex(Person person) {
		if (!(person.Sex.equals("��") || person.Sex.equals("Ů"))) {
			PrintInformations("�Ա�");
			return false;
		}
		return true;
	}
	
	/**
	 * �ж����
	 */
	public boolean isStature(Person person) {
		if (!(person.Stature > 0.0 && person.Stature < 3.0)) {
			PrintInformations("���");
			return false;
		}
		return true;
	}
	
	/**
	 * �ж�����
	 */
	public boolean isWeight(Person person) {
		if (!(person.Weight > 0.0 && person.Weight < 800.0)) {
			PrintInformations("����");
			return false;
		}
		return true;
	}
	
	/**
	 * ��ӡ����
	 */
	public  void PrintInformations(String Type){
		System.out.println("�Բ����������" + Type + "��������֤���������룡����");
	}	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		this.Sex = sex;
	}

	public double getStature() {
		return Stature;
	}

	public void setStature(double stature) {
		this.Stature = stature;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		this.Weight = weight;
	}


		
		
	
}
