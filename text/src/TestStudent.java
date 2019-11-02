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
		courseNames[0] = "计算机";
		courseNames[1] = "数学";
		courseNames[2] = "英语";
		courseScores[0] = courseScores[1] = courseScores[2] = 0;
	}
	public Student(String n,char s,int a){
		name = n;
		gender = s;
		age = a;
		courseNames = new String[3];
		courseScores = new double[3];
		courseNames[0] = new String("计算机");
		courseNames[1] = new String("数学");
		courseNames[2] = new String("英语");
		courseScores[0] = 0;
		courseScores[1] = 0;
		courseScores[2] = 0;
	}
	public void introduceMe(){
		System.out.println("我的名字："+name);
		System.out.println("我的性别和年龄分别是:"+gender+"、"+age);
		System.out.println("我的成绩还没有录入！");
	}
}
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student("张山",'M',23);
		
		stu1.introduceMe();
		System.out.println();
		stu2.introduceMe();
	}

}