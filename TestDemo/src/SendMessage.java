/**
 * ģ����Ϸ����
 * @author 87366
 *
 */
public class SendMessage {

	public static void main(String[] args) {
		SendMessage("İǳ��ԯ", "����Ƶ��", "CSGO��һ������û��", 5, 1);
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
				"�������",
				"�����ɶ��",
				"A1������һ������"
		};
		SendMessage(nicName,"Ĭ��Ƶ��",contents[(int)(Math.random()*2)],10,1);
	}
	/***
	 * 
	 * @param name			�����ߵ��ǳ�
	 * @param channelName	������Ƶ������
	 * @param message		����������
	 * @param count			�����Ĵ���
	 * @param intercal		������ʱ����
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int intercal) {
		String value=String.format("��%s�� %s�� %s", channelName,name,message);
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
