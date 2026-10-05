import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	
	public static void check(int guess, int number, int tries, Scanner in) {
		
		if (guess == number) {
			System.out.println("You win!");
			System.out.printf("You guessed %d and the number was %d.\n", guess, number);
		} else if (tries == 3) {
			System.out.println("You lost!");
			System.out.println("You ran out of tries");
			System.out.printf("The number was %d\n", number);
		} else if (guess > number) {
			System.out.printf("Your guess of %d is too high\n", guess);
			tries += 1;
			System.out.println("Try again");
			System.out.print("Type a number: ");
			guess = in.nextInt();
			in.nextLine();
			check(guess, number, tries, in);
		} else {
			System.out.printf("Your guess of %d is too low\n", guess);
			tries += 1;
			System.out.println("Try again");
			System.out.print("Type a number: ");
			guess = in.nextInt();
			in.nextLine();
			check(guess, number, tries, in);				
		}
		}
	
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(100) + 1;
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both).");
		System.out.println("Can you guess what it is?");
		System.out.print("Type a number: ");
		int guess = in.nextInt();
		in.nextLine();
		
		int tries = 1;
		
		check(guess, number, tries, in);
		}
	}
