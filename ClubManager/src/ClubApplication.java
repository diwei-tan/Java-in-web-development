
public class ClubApplication {
	public void message() {
		int num1 = 5;
		int num2 = 3;
		num1 -= num2;
		System.out.println(num1);
	}
	public static void main(String[]args) {
		//test
		
		Club clubYY = new Club();
		clubYY.addMember("Tan", "Di Wei", "Jairus");
		clubYY.addMember("Chia", "Yan Bin", "Wesley");
		clubYY.addMember("Guan", "Yang Yue", "Phoenix");
		clubYY.showMembers();
		try{
			clubYY.removeMember(3);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		clubYY.showMembers();
		clubYY.addMember("Guan", "Yang Yue", "Phoenix Rising");
		clubYY.showMembers();
		try{
			clubYY.removeMember(1);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		try{
			clubYY.removeMember(6);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		try{
			clubYY.removeMember(1);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		clubYY.addMember("Guan", "Yang Yue", "Phoenix Rising");
		clubYY.showMembers();
		clubYY.addMember("Guan", "Yang Yue", "Phoenix Rising");
		clubYY.addMember("Guan", "Yang Yue", "Phoenix Rising");
		clubYY.addMember("Guan", "Yang Yue", "Phoenix Rising");
		clubYY.showMembers();
		Facility f1 = new Facility("MPH", "Multi-purpose Hall");
		Facility f2 = new Facility("Computer Room");
		Facility f3 = new Facility ("Mac Commons", "Room with lots of macs");
		f1.show();
		f2.show();
		f3.show();
	}

}
