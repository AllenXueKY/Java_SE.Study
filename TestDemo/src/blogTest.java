import java.util.Arrays;
import java.util.Scanner;
public class blogTest {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] arr = { 99, 85, 82, 63, 60 };
      Arrays.sort(arr);
      int[] arr1 = Arrays.copyOf(arr, arr.length + 1);//用copyOf方法复制原来的数组得到比原来数组长度大1新数组arr1
      int index = 0;
      System.out.print("请输入要插入的数：");
      int a = input.nextInt();
      for (int i = 0; i < arr1.length; i++) {
         if (arr[i] > a) {
            index = i;
            break;
         }
      }
      for (int i = arr1.length - 1; i > index; i--) {
         arr1[i] = arr[i - 1];
      }
      arr1[index] = a;
      System.out.print("插入后的数下标是：" + index);
      System.out.println();
      System.out.print("插入后的数组元素为：");
      for (int i : arr1) {
         System.out.print(i + "\t");
      }
	}
}