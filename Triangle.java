import java.util.Scanner;

public class Triangle {
	
	public static int getLength(String str, Scanner in) {
		System.out.printf("Enter the length of the %s side: ", str);
		int value = in.nextInt();
		in.nextLine();
		return value;
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = getLength("first", in);
		int b = getLength("second", in);
		int c = getLength("third", in);
		
		if (a > b + c) {
			System.out.printf("You cannot form a triangle with the lengths of %d, %d, and %d.\n", a, b, c);	
		} else if (b > a + c) {
			System.out.printf("You cannot form a triangle with the lengths of %d, %d, and %d.\n", a, b, c);
		} else if (c > a + b) {
			System.out.printf("You cannot form a triangle with the lengths of %d, %d, and %d.\n", a, b, c);
		} else {
			System.out.printf("You can form a triangle with the lengths of %d, %d, and %d.\n", a, b, c);
			}
		}
	}
