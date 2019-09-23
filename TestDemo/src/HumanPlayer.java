/**
 * �������
 * @author 87366
 *
 */
public class HumanPlayer {
	//��̬��������ȭ���͵���Ϣ
	public static final int MessageTypeFist = 1;
	//��̬������Ӯ�ñ���ʱ����Ϣ
	public static final int MessageTypeWin = 2;
	//��̬�������������ʱ����Ϣ
	public static final int MessageTypeLose = 3;
	
	
	//���ԣ����ơ�������������ȭ������ɫ��Ӧ����Ч������ɫ�ĸ��Ի�̨��
	private String name;
	private int score;
	private int fist;
	//...............
	private String[] fistWords = {
			"���йⲨ~biubiubiu~~~",
			"���������ı���Ϊʲô��ô��~~",
			"�������Ȼ����ཷ��",
			"�ز�����ŷ��ɣ������һȭ~"
	};
	
	private String[] winWords = {
		"����˭~~",
		"��ȭ���е���˼~~",
		"~~~��~~~~��~~~",
		"ȫ������~~~������",
		"���Ż�����Ÿ裬Ȼ���������~"
	};
	
	private String[] loseWords = {
		"ͨ���ɹ���·������ʩ����~~",
		"�ȵ���ˮ��ȥ����֪��˭����Ӿ~~",
		"������ǲ��ã����ʱ�����������綼û�ú�~~",
		"���������ˣ���QQ���ϣ�����̣��ú�����һ���������ô�̫����QQ~~",
		"���˽����Ҷ��ѣ����������Ҷ���~~"
	};
	/**
	 * ���ݴ�����Ϣ�����ͣ��漴��ӡ��Ӧ���͵���Ϣ
	 * @param msgType ��ӦHumanPlayer���ж���ľ�̬����
	 */
	public void sendMessage(int msgType) {
		//����һ��0-4֮�������
		int Index = ((int)(Math.random() * 1000)) % 5;
		String message = null;//Ҫ��ӡ����Ϣ
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[Index];
			break;
		case MessageTypeWin:
			message = winWords[Index];
			break;
		case MessageTypeLose:
			message = loseWords[Index];
			break;	
		}
		System.err.println(message);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
    //���������ú͵õ����ơ���������������Ч����˵���Ի�̨�ʡ���ȭ


}













