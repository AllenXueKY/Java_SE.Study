import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *   后宫选妃
 * @author 87366
 *
 */
public class AppMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nnNameArray = {"西施","貂蝉","王昭君","杨玉环","赵飞燕","","","","",""};//后宫娘娘的姓名数组，预留五个空间
		String[] levalNames = {"贵人","嫔妃","贵妃","皇贵妃","皇后"};//对应的级别
		int[] leval =new int[10];
		int[] loves =new int[10];
		int nnCount = 5;
		int gameDays =1;//游戏默认运行10天
		for (int i = 0; i < nnCount; i++) {
			loves[i]=100;
		}

		while (gameDays<=10) {
			System.out.println("游戏进行到第"+gameDays+"天");
			System.out.println("1、皇帝下旨选妃\t\t（增加）");
			System.out.println("2、翻牌宠幸\t\t（修改状态）");
			System.out.println("3、打入冷宫\t\t（删除）");
			System.out.println("4、朕的爱妃呢？\t\t（查找、修改状态）");
			System.out.print("陛下请选择：");
			int choice=input.nextInt();
			switch (choice) {
			case 1://1、皇帝下旨选妃\t\t（增加）
				if (nnCount==nnNameArray.length) {
					System.out.println("皇帝陛下，后宫已经人满为患，皇帝家已没有米下锅啦》》添加失败！");
				}
				System.out.print("请输入新进娘娘的名讳：");
				String newName = input.next();
				nnNameArray[nnCount]=newName;
				loves[nnCount]=100;
				for (int i = 0; i < nnCount; i++) {
					loves[i]-=10;
				}
				nnCount++;
;				break;
			case 2://2、翻牌宠幸\t\t（修改状态）
				System.out.println("请输入新进娘娘的名讳：");
				String name = input.next();
				int searchIndex=Integer.MIN_VALUE;
				for (int i = 0; i < loves.length; i++) {
					if(name.compareTo(nnNameArray[i])==0) {
						searchIndex=i;
						break;
					}
				}
				if (searchIndex==Integer.MIN_VALUE) {
					System.out.println("陛下：不要活在梦中，要面对现实！");
					break;
				}
				loves[searchIndex]+=20;
				if(leval[searchIndex]==levalNames.length) {
					System.out.println(nnNameArray[searchIndex]+"娘娘已经已经母仪天下，升级失败！");
					loves[searchIndex]+=10;
					break;
				}
				leval[searchIndex]++;

				for (int i = 0; i < nnCount; i++) {
					if (i==searchIndex) {
						continue;
					}
					loves[i]-=10;	
				}
/*			    System.out.println("宠幸"+nnNameArray[searchIndex]+",好感度+10，升级为"+levalNames[searchIndex]);
				*/
				break;
			case 3:
			case 4:
			default:
				System.out.println("必须输入1-4之间的整数：");
				continue;
			}
			System.out.println("姓名\t级别\t好感度");
			for (int i = 0; i < nnCount; i++) {
				System.out.println(nnNameArray[i]+"\t"+levalNames[leval[i]]+"\t"+loves[i]);
			}
			gameDays++;
		}
		
		for (int i = 0; i < nnCount; i++) {
			System.out.println(nnNameArray[i]+"\t"+levalNames[leval[i]]+"\t"+loves[i]);
		}
	}
}
