
public class Facility {
	private String name;
	private String description;
	
	public Facility(String name, String desc) {
		this.name=name;
		description=desc;
	}
	public Facility(String name) {
		this(name, null);
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void show() {
		System.out.println(this.toString());
	}
	public String toString() {
		if(description==null) {
			return name;
		} else {
			return name + ": " + description;
		}
	}
}
