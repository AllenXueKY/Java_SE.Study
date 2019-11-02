class Student{
	String name;
	char gender;
	int age;
	String[] courseNames;
	double[] courseScores;
	public Student(){
		name = "unknown name!";
		gender = 'M';
		age = 0;
		courseNames = new String[3];
		courseScores = new double[3];
		courseNames[0] = "�����";
		courseNames[1] = "��ѧ";
		courseNames[2] = "Ӣ��";
		courseScores[0] = courseScores[1] = courseScores[2] = 0;
	}
	public Student(String n,char s,int a){
		name = n;
		gender = s;
		age = a;
		courseNames = new String[3];
		courseScores = new double[3];
		courseNames[0] = new String("�����");
		courseNames[1] = new String("��ѧ");
		courseNames[2] = new String("Ӣ��");
		courseScores[0] = 0;
		courseScores[1] = 0;
		courseScores[2] = 0;
	}
	public void introduceMe(){
		System.out.println("�ҵ����֣�"+name);
		System.out.println("�ҵ��Ա������ֱ���:"+gender+"��"+age);
		System.out.println("�ҵĳɼ���û��¼�룡");
	}
}
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student("��ɽ",'M',23);
		
		stu1.introduceMe();
		System.out.println();
		stu2.introduceMe();
	}

}