
public class TestStudent {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setStudentDetails("Intouch", new double[] {85.0,67.0,78.5} );
		std2.setStudentDetails("Sukonlawat", new double[] {90.0,59.8} );
		
		System.out.println("Student#1 Deails:");
		
		
		std1.displayStudentDetails();
		System.out.println("***********************");
		System.out.println("\nstudent#2 Details:");
		std2.displayStudentDetails();
		Line();
	}
	
	public static void lline(char ch) {
		
		for(int i=1;i<40;i++) {
			System.out.print(ch);
			
		}
		System.out.println();
	}

}
