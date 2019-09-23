import java.util.Scanner;

public class CircleTes {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.inputRadius();
//		circle.shoePerimter();
//		circle.showArea();
		
//		Circle circle = new Circle(25);
//		circle.showArea();°¢
		
		Scanner input = new Scanner(System.in);
		System.out.println("«Î ‰»Î‘≤µƒ∞Îæ∂£∫");
		double radius = input.nextDouble();
		CircleV2 circle = new CircleV2(radius);
		circle.show();
	}

}
