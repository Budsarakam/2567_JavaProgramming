
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.srtEmployeeDetails("John", 45, 20.0);
		emp2.srtEmployeeDetails("Jane", 38, 25.0);
		
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		
		System.out.println("Employee 1 Details:");
		emp2.displayEmployeeDetails();

	}

}
