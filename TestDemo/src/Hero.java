public class Hero {
/**
 * 
 */
	private long id;
	private String nickName;
	private int leval;
	private long currExp;  //当前经验值
	private long exp;   //当前级别升级所需经验值 - 固定值

	
	public Hero() {
		super();
	}

	public Hero(String nickName) {
		this.nickName = nickName;
	}
	
	public Hero(long id, String nickName, int leval, long exp) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.leval = leval;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		else
			this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	private void setNickName(String nickName) {
		if (null == nickName) {
			nickName = "未知英雄";
		}else {
			this.nickName = nickName;
		}
	}

	public int getLeval() {
		return leval;
	}

	public void setLeval(int leval) {
		if (leval < 1 || leval > 999) {
			this.leval = 1;//如果级别超限，就重新从一级开始
			//如果大于999，可以设置英雄角色轮回数+1
		}else {
			this.leval = leval;
		}
		this.leval = leval;
	}

	public long getCurrExp() {
		return currExp;
	}

	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}

	public long getExp() {
		//玩家每级升级所需经验公式：
		//((等级-1)^3 + 60)/5 * ((等级-1)*2+60)
		exp = ((long)Math.pow((leval- 1), 3) + 60) / 5 * ((leval - 1) * 2 + 60);	
		return exp;
	}
//因为玩家每个级别升级所需经验值是固定公式计算的，所以不需要用户手动调用
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}