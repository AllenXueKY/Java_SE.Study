import java.util.Scanner;

/**
 * ʹ�÷���ʵ��������ӡ
 * @author 87366
 *
 */
public class PrintCalendarDemo {
	public static int year = Integer.MIN_VALUE;
	public static int month = Integer.MIN_VALUE;
	private static int[] dayOfMonth= {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		PrintCalendar();

	}
	/**
	 * ��ӡ�������ķ���
	 */
	private static void PrintCalendar () {
		InputYearAndMonth();
		int sum=getSunDayOfYears();
		sum+=getSumDayOfMonth();
		printMonthTitle();
		PrintCalendarContent(sum%7);
	}
	/**
	 * ��ӡ����������
	 * @param dayOfWeek ����1�������ڼ�
	 */
	private static void PrintCalendarContent(int dayOfWeek) {
		int sepCount =0;
		if (dayOfWeek==0) {
			sepCount=6;
		}else {
			sepCount=dayOfWeek-1;
		}
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month-1]; i++) {
			System.out.print(i+1);
			if ((dayOfWeek+i)%7==0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	}
	
	
	private static void printMonthTitle() {
		String[] monthNames= {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		System.out.println("\t\t"+year+"\t"+monthNames[month-1]);
		String[] weeekday= {"����һ","���ڶ�","������" ,"������","������","������","������"};
		for (int i = 0; i < weeekday.length; i++) {
			System.out.print(weeekday[i]+"\t");
		}
		System.out.println();
	}
	
	/**
	 * �����û��������ݺ��·�
	 */
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		year = input.nextInt();
		System.out.print("�������·ݣ�");
		month= input.nextInt();
		input.close();
		input=null;
	}
	/**
	 * ���1900��year���������
	 */
	private static int getSunDayOfYears() {
		if (year==Integer.MIN_VALUE) {
			System.out.println("��ݴ���������������ݺ��·ݣ�");
			InputYearAndMonth();
		}
		int sum=0;
		for (int i = 1900; i < year; i++) {
			sum+=365;
			if (isleapYear(i)) {
				sum++;
			}
		}
		return sum;
	}
	/**
	 * �õ��û�year��1��1��month-1�����һ���������
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum=0;
		for(int i=0;i<month-1;i++) {
			sum+=dayOfMonth[i];
		}
		if(isleapYear(year)&&month>=3) {
			sum++;
		}
		return sum;
	}
	
	/**
	 * �����жϴ����year�����ǲ�������
	 * @param year Ҫ�жϵ����
	 * @return  �����꣬����true
	 */
	private static boolean isleapYear(int year) {
		return year %400==0||year%4==0&&year%100==0;
	}
	
	
	
}
