
public class Fibonacci {

	public static void main( String [] args) {
		
		int sum = 0;
		int a = 0;
		int b = 1;
		
		
		long Limit = 4000000;
		
		for (int c = a + b; c<Limit; c = a + b) {
			if (c % 2 == 0) {
				sum += c;
			}
			a = b;
			b = c;
			c = a + b;
		}
			System.out.println(sum);
	}
	
	
}
