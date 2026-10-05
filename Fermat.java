public class Fermat {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int c = 30;
		int n = 3;
		
		if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
			System.out.println("Holy smokes, Fermat was wrong!");
			} else {
				System.out.println("No, this doesn't work.");
			}
		}
	}
