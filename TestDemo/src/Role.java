/**
 * 
 * @author 87366
 *
 */
public class Role {
	public String name;
	public int level;
	public String job;
	public Role() {
		
	}//好习惯，   重载
	/**
	 * 构造方法/构造器
	 * 1、没有返回值
	 * 2、方法名和类名一致
	 * 3、可以指定参数及实现重载
	 * 4、注意隐式构造和参数化构造不能共有
	 */
	public Role(String name1,int level1, String job1) {
		name = name1;
		level = level1;
		job = job1;
	}
	public void show() {
		System.out.println(name + "\t" + level + "\t" + job);
	}
	public void doSkill(){
		if (name.equals("劳拉")) {
			System.out.println("劳拉的经典技能：穿墙老太婆");
		}else if (name.equals("孙悟空")) {
			System.out.println("吃俺老孙一棒");
		}else {
			System.out.println(name + "：发出了一记必杀");
		}
		
	}
}
