import java.util.Scanner;

import javax.swing.*;

public class Lad504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[]scores = new double[5];
		double total = 0;
		
		for(int i=0; i < scores.length; i++) {
			System.out.print("Input score f student " + (i+1) + ":");
			scores[i] = scanner.nextDouble();
			total += scores[i];
		}
		
		double average =total / scores.length;
		System.out.println("\nAverage of 5 student is " + String.format("%.2f", average));
		System.out.println("> Student with scores higher than average:");
		
		
			for(int i=0; i< scores.length; i++) {
				if(scores[i] > average) {
					System.out.println("> Student" + (i + 1) + "(" + String.format("%.2f", scores[i] + ")");
				}
			}

			scanner.close();
	}

}
