import java.util.Scanner;

public class YearDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ��ѯ����ݣ�");
		int year = input.nextInt();
		System.out.print(year+"������Ӧ����ФΪ��"+WhatZodiac(year));
	}
	public static String WhatZodiac(int year) {
		String[]  Zodiac = {"��","ţ","��","��","��","��","��","��","��","��","��","��"};
		return Zodiac[(year-1900)%12];
	}

}
