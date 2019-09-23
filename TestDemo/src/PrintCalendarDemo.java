import java.util.Scanner;

/**
 * 使用方法实现月历打印
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
	 * 打印月历核心方法
	 */
	private static void PrintCalendar () {
		InputYearAndMonth();
		int sum=getSunDayOfYears();
		sum+=getSumDayOfMonth();
		printMonthTitle();
		PrintCalendarContent(sum%7);
	}
	/**
	 * 打印月历的内容
	 * @param dayOfWeek 当月1号是星期几
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
		String[] monthNames= {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		System.out.println("\t\t"+year+"\t"+monthNames[month-1]);
		String[] weeekday= {"星期一","星期二","星期三" ,"星期四","星期五","星期六","星期日"};
		for (int i = 0; i < weeekday.length; i++) {
			System.out.print(weeekday[i]+"\t");
		}
		System.out.println();
	}
	
	/**
	 * 接受用户输入的年份和月份
	 */
	private static void InputYearAndMonth() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		year = input.nextInt();
		System.out.print("请输入月份：");
		month= input.nextInt();
		input.close();
		input=null;
	}
	/**
	 * 获得1900到year年的总天数
	 */
	private static int getSunDayOfYears() {
		if (year==Integer.MIN_VALUE) {
			System.out.println("年份错误，请重新输入年份和月份！");
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
	 * 得到用户year年1月1号month-1月最后一天的总天数
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
	 * 用来判断传入的year变量是不是闰年
	 * @param year 要判断的年份
	 * @return  是闰年，返回true
	 */
	private static boolean isleapYear(int year) {
		return year %400==0||year%4==0&&year%100==0;
	}
	
	
	
}
