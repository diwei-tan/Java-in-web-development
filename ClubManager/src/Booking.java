import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
	private Member member;
	private Facility facility;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	public Booking(Member m, Facility f, LocalDateTime start, LocalDateTime end) throws BadBookingException{
		if(m==null)
			throw new BadBookingException("Member is required");
		if(f==null)
			throw new BadBookingException("Facility is required");
		if(start ==null || end==null)
			throw new BadBookingException("start and end dates are required");
		if(start.isAfter(end))
			throw new BadBookingException("start date cannot be after end date");
		member = m;
		facility = f;
		startDate = start;
		endDate = end;
	}
	public Member getMember() {
		return member;
	}
	public Facility getFacility() {
		return facility;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public boolean overlaps(Booking booking) {
		return(facility==booking.getFacility() && endDate.isAfter(booking.getStartDate()) && startDate.isBefore(booking.getEndDate()));
	}
	public void show() {
		System.out.println(this.toString());
	}
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy h:mm a");
		return facility.getName()+" is booked by "+member.toString()+" from "+startDate.format(dtf)+" to "+endDate.format(dtf);
	}
}
