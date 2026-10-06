import java.util.Scanner;



public class Quadratic {
	public static int enterCoef(String str, Scanner in) {
		System.out.printf("Enter coefficient %s: ", str);
		int value = in.nextInt();
		in.nextLine();
		return value;
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = enterCoef("a", in);
		int b = enterCoef("b", in);
		int c = enterCoef("c", in);
		
		if (Math.pow(b, 2) - 4*a*c < 0 || a == 0) {
			System.out.println("There is no solution");
		} else if (Math.pow(b, 2) - 4*a*c == 0){
			double x = -b / (2.0 * a);
			System.out.printf("The single solution is: %f\n", x);
		} else {
			double x1 = (-b + Math.sqrt(Math.pow(b, 2.0) - 4.0*a*c)) / (2.0 * a);
			double x2 = (-b - Math.sqrt(Math.pow(b, 2.0) - 4.0*a*c)) / (2.0 * a);
			System.out.printf("The two solutions are: %f and %f\n", x1, x2);
			}
		}
	}
