package programs;
import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String [] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		 
		
		System.out.println("Enter a year: ");
		int year = scnr.nextInt();
		
		int zodiacYear = (year) % 12;
		
		System.out.println(year + " is the year of the " + zodiac[zodiacYear]);
		
		

	}

}
