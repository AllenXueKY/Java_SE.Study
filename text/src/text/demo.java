//package text;
//
//import javax.security.auth.x500.X500Principal;
///**
// * �˿���
// * @author 87366
// *
// */
//public class demo {
//	public static void main(String[] args) {
//		final int N = 52;
//		String[] cardColors= {"����","����","����","÷��"};
//		String[] cardValues= {
//				"A","2","3","4","5","6","7","8","9","10",
//				"J","Q","K"
//		};
//		int[] cards = new int[N ];
//		for (int i = 0; i < cards.length; i++) {
//			cards[i]=i;
//		}
//		System.out.println("ϴ��ǰ��");
//		for (int i = 0; i < cards.length; i++) {
//			System.out.printf("%s-%s",cardColors[cards[i]/13],cardValues[cards[i]%13]);
//			if ((i+1)%13==0) {
//				System.out.println();
//			}else {
//				System.out.print("��");
//			}
//		}
//		for (int i = 0; i < cards.length; i++) {
//			int newIndex=(int)(Math.random()*N);
//			int temp=cards[i];
//			cards[i]=cards[newIndex];
//			cards[newIndex]=temp;
//		}
//		
//
//		System.out.println("ϴ�ƺ�");
//		for (int i = 0; i < cards.length; i++) {
//			System.out.printf("%s-%s",cardColors[cards[i]/13],cardValues[cards[i]%13]);
//			if ((i+1)%13==0) {
//				System.out.println();
//			}else {
//				System.out.print("��");
//			}
//		}
//	}
//}
/**
 * 
 */

















