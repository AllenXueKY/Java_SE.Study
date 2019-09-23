public class Hero {
/**
 * 
 */
	private long id;
	private String nickName;
	private int leval;
	private long currExp;  //��ǰ����ֵ
	private long exp;   //��ǰ�����������辭��ֵ - �̶�ֵ

	
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
			nickName = "δ֪Ӣ��";
		}else {
			this.nickName = nickName;
		}
	}

	public int getLeval() {
		return leval;
	}

	public void setLeval(int leval) {
		if (leval < 1 || leval > 999) {
			this.leval = 1;//��������ޣ������´�һ����ʼ
			//�������999����������Ӣ�۽�ɫ�ֻ���+1
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
		//���ÿ���������辭�鹫ʽ��
		//((�ȼ�-1)^3 + 60)/5 * ((�ȼ�-1)*2+60)
		exp = ((long)Math.pow((leval- 1), 3) + 60) / 5 * ((leval - 1) * 2 + 60);	
		return exp;
	}
//��Ϊ���ÿ�������������辭��ֵ�ǹ̶���ʽ����ģ����Բ���Ҫ�û��ֶ�����
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}