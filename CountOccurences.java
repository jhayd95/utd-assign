package programs;
import java.util.Scanner;
public class CountOccurences {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int[] count = new int [100];
		int[] numbers = new int [100];
		
	
		int i = 0;
		int temp = 0; // temporarily holds value of numbers at a certain index point
		
		System.out.println("Enter integers between 1 and 100 (End with 0): ");
		
		//intializes numbers array with user input
		for( i = 0; i < numbers.length; i++) {
	
			numbers[i] = scnr.nextInt();
			
			//if user ends with 0, then the input will end
			if(numbers[i] == 0) {
				break;
			}
			
			}
		
		//values are stored in temp variable, and it acts as a index value for the count array
		for (i= 0; i < numbers.length; i++) {
			temp = numbers[i];
			count[temp]++;
		}
				
		for (i = 1; i < count.length; i++) {
			if (count[i] > 0 && count [i] == 1) {
				System.out.printf("%d occurs %d time(s)\n",i, count[i]);
			}
			else if (count[i] >= 2) {
				System.out.printf("%d occurs %d time(s)\n",i, count[i]);
			}
		}
			

	}

}
