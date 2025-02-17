
public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Barista() {
		this.name = "Unknown";
		this.gender =' ';
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenderName() {
		if (gender == 'M') return "Male";
		if (gender == 'L') return "Female";
		return "spacebar";
	}
	
	

}
