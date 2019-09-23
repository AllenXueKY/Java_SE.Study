/**
 * 模拟游戏喊话
 * @author 87366
 *
 */
public class SendMessage {

	public static void main(String[] args) {
		SendMessage("陌浅轩辕", "世界频道", "CSGO来一波，有没有", 5, 1);
		SendMessage("GOD_XKY");
	}
	
	public static void SendMessage(String nickName,String channalName) {
//		SendMessage(name, channelName, message, count, intercal);
	}
	/**
	 * 
	 * @param nicName
	 */
	public static void SendMessage(String nicName) {
		String[] contents= {
				"你吃了吗？",
				"你想干啥？",
				"A1高闪来一个好吗"
		};
		SendMessage(nicName,"默认频道",contents[(int)(Math.random()*2)],10,1);
	}
	/***
	 * 
	 * @param name			喊话者的昵称
	 * @param channelName	喊话的频道名称
	 * @param message		喊话的内容
	 * @param count			喊话的次数
	 * @param intercal		喊话的时间间隔
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int intercal) {
		String value=String.format("【%s】 %s： %s", channelName,name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(intercal*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
