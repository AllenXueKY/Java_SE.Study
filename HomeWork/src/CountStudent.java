import java.util.Scanner;
public class CountStudent {
/**
 * ����������ѧ�������Լ�רҵ���ƣ��ֱ�ͳ�Ƹ�רҵ������Ů���ĸ���
 * ѧ�����飺�������Ա�רҵ
 * String names[]  String sex[]  String majors[]
 * @param args
 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the total number of students:");
		int counts = input.nextInt();
		String[] names = new String[counts];//����
		String[] sex = new String[counts];  //�Ա�
		String[] majors = new String[counts];//רҵ����
		System.out.println("***Note:This program must be input in English.(eg:ZhangSan Male ComputerScience)***");
		for (int i = 0; i < counts; i++) {
			System.out.println("Please enter the names, gender and professional names of the students in the order of "+(i+1));
			names[i] = input.next();
			sex[i] = input.next();
			majors[i] = input.next();
		}
		System.out.println("The generated student information is as follows:");
		for (int i = 0; i < counts; i++) {
			System.out.println(names[i] + "\t" + sex[i] + "\t" + majors[i]);
		}
		System.out.println("Please enter the professional name to query:");
		String findMajor = input.next();//Ҫ���ҵ�רҵ����
		int[] numbers = new int[counts];//���������ڼ�¼��רҵѧ�����ڵ��������
		int j = 0;                      //��רҵ������
		for (int i = 0; i < counts; i++) {
			if (majors[i].compareTo(findMajor)==0){				
				numbers[j] = i;
				j++;
			}
		}
		int MaleConut=0;			//��רҵ��������
		for (int i = 0; i < j; i++) {
			if(sex[i].compareTo("Male") == 0) {
				MaleConut++;		
			}
		}
		System.out.println("The number of Male students in this major is:"+ MaleConut);
		System.out.println("The number of Female students in this major is:"+ (j-MaleConut));
	}
}
