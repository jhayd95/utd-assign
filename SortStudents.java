package programs;
import java.util.Scanner;
import java.util.Arrays;

public class SortStudents {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the number of students: ");
		int numStudents = scnr.nextInt();
		int [] grades = new int [numStudents];
		String[] studentNames = new String [numStudents];
		String [] studentList = new String [numStudents];
		
		
		System.out.println("Enter the names of the students: ");
		for ( i = 0; i < numStudents; i++ ) {
			 studentNames[i] = scnr.next();
			studentList[i] = studentNames[i];
		}
		
		System.out.println("Enter Student Grades: ");
		for (i = 0; i < numStudents; i++ ) {
			grades[i] = scnr.nextInt();
			System.out.println("Student " + studentNames[i] + " made a " + grades[i]);
		}
		
		
		for(i = numStudents -1; i > numStudents; i--) {
					int first = 0;
					for (j = 1; j<= i; j++) {
						if (grades[i] < grades[first]) {
							first = j;
						}
					int temp = grades[first];
					grades[first]= grades[i];
					grades[i] = temp;
				}
			
		}
		
		
		
		
		for (i = 0; i < numStudents; i++) {
			System.out.println(studentNames[i] +" scored:  "+ grades[i]);

		}
	}

}
