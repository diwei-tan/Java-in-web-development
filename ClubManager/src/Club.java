
public class Club {
	private static int memberCount =0;
	private static int membershipNum =1;
	private Member[] clubMembers = new Member[100];
	public void addMember(String surname, String firstname, String secondName) {
		Member m = new Member(membershipNum, surname, firstname, secondName);
		clubMembers[memberCount++]=m;
		membershipNum++;
		
	}
	public Member[] getClubMembers() {
		return clubMembers;
	}
	public static int getMemberCount() {
		return memberCount;
	}
	public void showMembers() {
		for(int i=0; i<memberCount; i++) {
			clubMembers[i].show();
		}
	}
	//take into consideration number inputed can be any positive
	//If greater than member count, not within range of array
	public void removeMember(int num) throws Exception{
		boolean notFound=true;
		int start;
		if (num>memberCount) {
			start=memberCount;
		}
		else {
			start = num-1;
		}
		//More efficient to search from top/number given
		for(int i=start; i>=0; i--) {
			if(clubMembers[i].getMemberNo()==num) {
				for(int j=i+1; j<memberCount; j++) {
					clubMembers[j-1]=clubMembers[j];
				}
				System.out.println("Removed memeber no. " + num);
				memberCount--;
				notFound=false;
				break;
			}
		}
		if(notFound) {
			throw new Exception("Memebership number " + num + " was not found.");
		}
	}
}
