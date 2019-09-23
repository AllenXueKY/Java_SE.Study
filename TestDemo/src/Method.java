/**
 * 方法
 * @author 87366
 *
 */
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
		System.out.print("请输入今天是星期几：");
		int dayOfWeek = new Scanner(System.in).nextInt();
		ShowWeekDayByChinese(dayOfWeek-1);
		ShowWeekDayByJapanese(dayOfWeek-1);
		ShowWeekDayByEnglish(dayOfWeek-1);	
	}
	private static boolean isRight(int dayOfWeek) {
		if (dayOfWeek<0||dayOfWeek>6) {
			return false;
		}
		return true;
	}
	/**
	 * 以中文的方式打印星期几
	 * @param dayOfWeek 1-7之间的整形数字，用来表示星期几
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek) {
		String[] weekday = {"星期一","星期二","星期三" ,"星期四","星期五","星期六","星期日"};
		if (isRight(dayOfWeek)) {
			System.out.println(weekday[dayOfWeek]);
			return;
		}
		System.out.println("输入有误！请输入1-7之间的数字");
	}
	/**以日文的方式打印星期几
	 * 
	 * @param dayOfWeek
	 */
	public static void ShowWeekDayByJapanese(int dayOfWeek) {
		String[] weekday = {"月曜日","火曜日","水曜日" ,"木曜日","金曜日","土曜日","日曜日"};
		if (isRight(dayOfWeek)) {
			System.out.println(weekday[dayOfWeek]);
			return;
		}
		System.out.println("输入有误！请输入1-7之间的数字");
	}
	
	public static void ShowWeekDayByEnglish(int dayOfWeek) {
		String[] weekday = {"Monday","Tuesday","Wednesday" ,"Thursday","Friday","Saturday","Sunday"};
		if (isRight(dayOfWeek)) {
			System.out.println(weekday[dayOfWeek]);
			return;
		}
		System.out.println("输入有误！请输入1-7之间的数字");
	}
}
