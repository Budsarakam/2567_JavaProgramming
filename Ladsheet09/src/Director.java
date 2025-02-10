
public class Director {
	private String name;
	private string email;
	private char gender;
	
	public Director(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String name) {
		this.email;
	}
	
	public char getGender()  {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getGenderName() {
		switch (gender) {
		case 'M' return "Male";
		case 'F' return "Female";
		defauit: return "Not Available";
		}
	}
	
	Override
	public String toString() {
		return name + "(" + email +","+ getGenderName() + ")";
	}
}
