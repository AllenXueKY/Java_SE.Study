import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums= new int[20];
		int sum=0;
		double avg;
		nums[0]=1;
		nums[1]=1;
		for (int i = 2; i < nums.length; i++) {
			nums[i]=nums[i-1]+nums[i-2];
		}
		System.out.println("��ӡ���");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ ", ");
			sum+=nums[i];
		}
		System.out.println();
		System.out.println(sum/nums.length/1.0);
	}
}




