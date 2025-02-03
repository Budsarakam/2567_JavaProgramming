import java.util.*;

import javax.sound.sampled.Line;
public class TestStudent {
	public static void main(String[] rgs) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How mant students in classroom: ");
		int numberofStudent = scan.nextInt();
		
		Student[] student = new Student[numberofStudent];
		
		for(int i=0; i<numberofStudent; i++) {
			student[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			
			System.out.print("Input student name: ");
			Student[i].setName(scan.nextLine());
			
			System.out.print("Input sudentt score: ");
			int stdScore = scan.nextLine();
			scan.nextLine();
			student[i].setScore();
			while(!student[i].checkScpre()) {
				System.out.print("Input student score, again: ");
				stdScore = scan.nextInt();
				student[i].stdScore(stdScore);
		}
		
		scan.close();
	}
	
	public static void Line() {
		for(int i=1; i<40; i++) {
			System.out.print("-");
		}
	}
	
	

}
