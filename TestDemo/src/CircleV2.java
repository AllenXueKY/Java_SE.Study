
public class CircleV2 {
	//Բ�İ뾶
	private double radius;
	//Բ���ܳ�
	private double perimeter;
	//Բ�����
	private double area;
	
	public double getRadius() {
		return radius;
	}
	
	public void show() {
		System.out.println("�ܳ�Ϊ��" + this.getPerimeter());
		System.out.println("���Ϊ��" + this.getArea());
	}
	
	public void setRadius(double radius) {
		if (radius <= 0) {//��װ�ĺô������ԶԴ�������Խ��м򵥵���֤
			radius =1;
		}else {
			this.radius = radius;
		}
		//this->����һ����ָ�� ��/����
		this.radius = radius;
	}
	
	

	public CircleV2(double radius) {
		this.setRadius(radius);
	}

	public CircleV2() {}

	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	
	
	
}
