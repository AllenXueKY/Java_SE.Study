import java.util.Scanner;

public class AppUserMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ���´���ʵ���û�ע��
		System.out.println("�������û�����");
		String userName = input.next();
		System.out.println("���������룺");
		String password = input.next();
		System.out.println(StringUtil.validatePassword(password));
		
		
		
		
		
//		System.out.println("���������䣺");
//		String email = input.next();
	}

}
