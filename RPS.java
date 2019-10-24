package programs;
import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
	
				//a series of variables waiting for initialization.
				int userWins = 0;
				int comWins = 0;
				int ties = 0;
				int userValue = 0;
				int comValue = 0;
				//for loop that runs the game five times.
				for (int i = 0; i < 5; i++) {
				
				//a series of method calls
				int comChoice = computerChoice(comValue);
				int userChoice = menu(userValue);
				isValid(userChoice);
				determineWin(userChoice, comChoice);
				
				
				
				//this series of switch statements will determine who gets a point, determined by the user and computers choice
				switch (comChoice) {
			case 0 : 
				if(userChoice == 0) {
					ties++;
					}
				else if (userChoice == 1) {
					userWins++;
				}
				else if (userChoice == 2) {
					comWins++;
				}
				break;
				
			case 1 : 
				if(userChoice == 0) {
					comWins++;
					}
				else if (userChoice == 1) {
					ties++;
				}
				else if (userChoice == 2) {
				}
				break;
				
			case 2 : 
				if(userChoice == 0) {
					userWins++;
					}
				else if (userChoice == 1) {
					comWins++;
				}
				else if (userChoice == 2) {
					ties++;
				}
				break;
				}
				
				}
				max(userWins, comWins, ties);
				
			}

			//method that generates a random integer up to two
			public static int computerChoice(int comValue) {
				Random r = new Random();
				return comValue = r.nextInt(2);
			}
			//This method displays the menu for the game and asks for user input to begin
			public static int menu(int userValue) {
				System.out.println("Let's play rock, paper, scizzors!");
				System.out.println("Rock(1), Paper(2), Scizzors(0)");
				Scanner scnr = new Scanner(System.in);
				return userValue = scnr.nextInt();
			}
			//this method checks to make sure the user inputs the proper value. If not, the output returns invalid
			public static int isValid(int userChoice) {
				if(userChoice == 1 || userChoice == 2 || userChoice == 0) {
					System.out.println(userChoice);
				}
				else {
					System.out.println("Invalid");
				}
				return userChoice;
			}
			
			//this method also uses switch statements to display who is the winenr of the game.
			public static void determineWin(int userChoice, int comChoice) {
			
				switch (comChoice) {
			case 0 : 
				if(userChoice == 0) {
					System.out.println("We both choose scissors! Tie!");
					}
				else if (userChoice == 1) {
					System.out.println("You picked rock, and I picked scizzors! You Win!");
				}
				else if (userChoice == 2) {
					System.out.println("You picked paper, and I picked scizzors! You lose!");
				}
				break;
				
			case 1 : 
				if(userChoice == 0) {
					System.out.println("You picked scizzors, and I picked rock. You lose!");
					}
				else if (userChoice == 1) {
					System.out.println("We both picked rock! Tie!");
				}
				else if (userChoice == 2) {
					System.out.println("You picked paper, and I picked rock! You Win!");
				}
				break;
				
			case 2 : 
				if(userChoice == 0) {
					System.out.println("You picked scissors, and I picked paper. You Win!");

					}
				else if (userChoice == 1) {
					System.out.println("You picked rock, and I picked paper! You lose!");

				}
				else if (userChoice == 2) {
					System.out.println("We both picked paper! Tie!");

				}
				break;
			}
			
				
			
			}
			
			//method max displays the stats of the whole match and displays the overall winner.
			public static void max (int userWins, int comWins, int ties) {
				System.out.println("User Wins: " + userWins);
				System.out.println("Com Wins: " + comWins);
				System.out.println("Ties: " + ties);
				
				if (userWins > comWins || userWins == comWins) {
					System.out.println("User Wins The Game");
				}
				else if (userWins < comWins || comWins == ties) {
					System.out.println("Computer Wins The Game");
				}
			
	}

}
