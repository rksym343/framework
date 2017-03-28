package kr.or.dgit.book_project.dto;

public class Member {

	private String mCode;
	private String mName;
	private String tel;
	private int mLendCount;
	private boolean isSecsn;

	public Member(String mCode) {
		super();
		this.mCode = mCode;
	}

	public Member(String mCode, String mName, String tel, int mLendCount, boolean isSecsn) {
		super();
		this.mCode = mCode;
		this.mName = mName;
		this.tel = tel;
		this.mLendCount = mLendCount;
		this.isSecsn = isSecsn;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getmLendCount() {
		return mLendCount;
	}

	public void setmLendCount(int mLendCount) {
		this.mLendCount = mLendCount;
	}

	public boolean isSecsn() {
		return isSecsn;
	}

	public void setSecsn(boolean isSecsn) {
		this.isSecsn = isSecsn;
	}

	@Override
	public String toString() {
		return String.format("Member [mCode=%s, mName=%s, tel=%s, mLendCount=%s, isSecsn=%s]", mCode, mName, tel,
				mLendCount, isSecsn);
	}

}
