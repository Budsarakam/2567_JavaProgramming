
public class Ladsheet08 {
	class Date {
		private int dMonth;
		private int dDay;
		private int dYear;
		
		public Date() {
			this.dYear = 1;
			this.dDay = 1;
			this.dYear = 2000;
		}
		
		public Date(int month, int day, int year) {
			this.dMonth = month;
			this.dDay = day;
			this.dYear = year;
		}
		
		public void setDate(int month, int day, int year) {
			this.dMonth = month;
			this.dDay = day;
			this.dYear = year;
		}
		
		public int getDay() {
			return dDay;
		}
		
		public int getMonth() {
			return dMonth;
		}
		
		public int getYear() {
			return dYear;
		}
		
		public String toString() {
			return dMonth + "-" + dDay + "+" dYear;
		}
	}
	
	class Person {
		private String firstName;
		private String lastName;
		
		public Person() {
			this.firstName = "";
			this.lastName = "";
		}
		
		public Person(String first , String last) {
			this.firstName = first;
			this.lastName = last;
		}
		
		public void setName(String first, String last) {
			this.firstName = first;
			this.lastName = last;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String toString() {
			return firstName + "" + lastName;
		}
	}
	
	class PersonalInfo {
		private Person name;
		private Data d
	}

}
