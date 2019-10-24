package programs;
import java.util.Scanner;
public class IndexSmallElement {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double [] array = new double [10];
		System.out.print("Enter numbers (ten total).");

        for(int i = 0; i < 10; i++){             //enter 10 numbers to average
            
            array[i] = scnr.nextDouble();
        }
		System.out.println("The smallest number is at index point  " + indexofSmallestElement(array));

	}

	public static int indexofSmallestElement(double [] array){
		
		int index = 0;
		double min = array[index];
		for (int i = 0; i < array.length;i++ ) {
			if (array[i] < min) {
				min = array[i];
				index = i+1;
				}
			
		}
		return index;
		
	}

}
