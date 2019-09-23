import java.beans.IntrospectionException;

/**
 * 
 * @author 87366
 *
 */
public class MinMaxDemo {

	public static void main(String[] args) {
		int[] nums=new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;
		}
		int max=nums[0];
		int min=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>max) {
				max=nums[i];
			}
			if (nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("数组中最大值为："+max);
		System.out.println("数组中最小值为："+min);
	}

}
