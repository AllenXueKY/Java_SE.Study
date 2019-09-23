import java.util.Scanner;
/**
 * 十六进制和十进制之间的转换
 */
public class HexToDecimalDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整形数字：");
		int decNum=input.nextInt();
		System.out.println(DecToHex(decNum));
		System.out.println(HexToHDec(DecToHex(decNum)));
	}
	/**
	 * 调用方法将十进制转换为十六进制
	 * @param decNum 要转换的十进制数字
	 * @return 转换成十六进制的数字（以字符串的方式返回）
	 */
	public static String DecToHex(int decNum) {
		String hex ="";
		while (decNum!=0) {
			int temp = decNum%16;
			if (temp>=0&&temp<=9) {
				hex = temp+hex;
			}else if(temp>=10&&temp<=15) {
				hex=(char)(temp-10+'A')+hex;
			}
			decNum/=16;
		}
		return hex;
	}
	/**
	 * 十六进制转换为十进制
	 * @param hex 要转换的十六进制字符串
	 * @return	转换成功的十六进制数
	 */
	public static int  HexToHDec(String hex){
		int decNum=0;
		for (int i = 0; i < hex.length(); i++) {
			char tempChar=hex.charAt(i);
			if (tempChar>='0'&&tempChar<='9') {
				decNum+=(tempChar-'0')*Math.pow(16, hex.length()-i-1); 
			}else if (tempChar>='A'&&tempChar<='F') {
				decNum+=(tempChar-'A'+10)*Math.pow(16, hex.length()-i-1); 
			}
		}
		return decNum;
	}	
}
