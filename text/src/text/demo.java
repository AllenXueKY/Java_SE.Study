package text;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		String index;
		Scanner inputScanner = new Scanner(System.in);
		index=inputScanner.nextLine();
		for (int i = 0; i < index.length(); i++) {
			char x= index.charAt(i);
			System.out.print(x);
			Character.isJavaIdentifierPart(x);
		}
	}
}

















