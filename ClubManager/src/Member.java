
public class Member extends Person {
	private int memberNo;
	public Member (int memberNo, String surname, String firstname, String secondname) {
		super(surname, firstname, secondname);
		this.memberNo=memberNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public String toString() {
		return super.toString() + ": " + memberNo;
	}

}
