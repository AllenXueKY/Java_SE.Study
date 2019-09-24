import java.util.Scanner;
/**
   *     判断小数点
 * @author 87366
 *
 */
public class StringDemo {
	/**
	   * 判断传入的字符串是否是一个 正确格式的小数
	   * 字符串只能有一个小数点，小数点不能在第一位，也不能在最后一位
	 * @param str
	 * @return
	 */
	public static boolean isDecimal(String str){
		boolean isDecimal = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				if (str.charAt(i) == '.') {
					//如果小数点在第一位或最后一位，仍然是非法的，返回false
					if (i == 0 || i == str.length() - 1) {
						isDecimal = false;
						break;
					}
				}else{//如果当前字符不是数字并且也不是小数点，那么证明是非法字符，直接返回false
					isDecimal = false;
					break;
				}
			}
		}
		//判断字符串中只能有一个小数点
		//1.存在小数点 2.从前搜索的下标和从后往前搜索的小标刚好相等
		if (!(str.contains(".") && str.indexOf(".") == str.lastIndexOf("."))) {
			return false;
		}
				
		//1.判断字符串中的每个元素必须是数字或小数点
		//2.如果有小数点，那么小数点不能在第一位和最后一位，并且只能有一个小数点
		return true;
	} 
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("请输入金额：");
		String numString = "0.0";
		for(;true;){
			numString = inputScanner.next();
			if (isDecimal(numString)) {
				System.out.println("读取成功！！！");
				break;
			}else {
				System.out.println("警告：小数点错误！！！请重新输入！！！");
				System.out.print("请输入金额：");
				continue;
			}		
		}		
	}
}
