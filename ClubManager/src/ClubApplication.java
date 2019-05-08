import java.time.LocalDateTime;

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
		
		clubYY.addFacility("MPH", "Multi-purpose Hall");
		clubYY.addFacility("Computer Room", null);
		clubYY.addFacility("Mac Commons", "Study-room with lots of Macs");
		clubYY.showFacilities();
		clubYY.show();
		
		//Booking testing
		try {
			Booking booking = new Booking(clubYY.getClubMembers().get(0), clubYY.getFacility("MPH"), LocalDateTime.now(), LocalDateTime.now().plusDays(5));
			System.out.println(booking.toString());
		} catch (BadBookingException e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
	}

}
