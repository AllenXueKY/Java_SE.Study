/**
 * 电脑玩家
 * @author 87366
 *
 */
public class ComPlayer {
	//静态常量：出拳类型的信息
	public static final int MessageTypeFist = 1;
	//静态常量：赢得比赛时的信息
	public static final int MessageTypeWin = 2;
	//静态常量：输掉比赛时的信息
	public static final int MessageTypeLose = 3;
	
	
	//属性：名称、分数、所出的拳、（角色对应的音效）、角色的个性化台词
	private String name;
	private int score;
	private int fist;
	//...............
	
	/***
	 * 所有台词变化一下
	 */
	private String[] fistWords = {
			"动感光波~biubiubiu~~~",
			"大象大象你的鼻子为什么这么长~~",
			"大姐姐你先换吃青椒吗？",
			"胸部扁扁的欧巴桑，吃我一拳~"
	};
	
	private String[] winWords = {
		"还有谁~~",
		"猜拳，有点意思~~",
		"~~~超~~~~神~~~",
		"全军出击~~~！！！",
		"吃着火锅唱着歌，然后你就输了~"
	};
	
	private String[] loseWords = {
		"通往成功的路上总在施工中~~",
		"等到潮水退去，就知道谁在裸泳~~",
		"夏天就是不好，穷的时候我连西北风都没得喝~~",
		"将来我死了，把QQ捐给希望工程，让孩子们一上来就能用带太阳的QQ~~",
		"众人皆醉我独醒，举世皆浊我独清~~"
	};
	/**
	 * 根据传入消息的类型，随即打印对应类型的信息
	 * @param msgType 对应HumanPlayer类中定义的静态常量
	 */
	public void sendMessage(int msgType) {
		//生成一个0-4之间的数字
		int Index = ((int)(Math.random() * 1000)) % 5;
		String message = null;//要打印的消息
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
		//电脑的出拳实际上就是生成1-3之间的随机数
		fist = ((int)(Math.random() * 30000)) % 3 + 1;
		return fist;
	}
//
//	public void setFist(int fist) {
//		this.fist = fist;
//	}
	
	
    //方法：设置和得到名称、分数、（播放音效）、说个性化台词、出拳


}













