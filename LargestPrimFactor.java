
public class LargestPrimFactor {

	public static void main (String[] args) {

	double sum = 1;
	double a = 600851475143.0;
	double c = 0;
	double limit = 1000000000000000000.0;
	
	for (double i = 1; i<1000000;i++) {
		if(a % i == 0) {
		sum = i * sum;
		if (i > c ) {
			c = i;
		
		if(sum == a) {
			System.out.println("finish");
			break; 
		
		}
		else {
			
		}	
			
		}
		}	
		
	}
	
		
	
	System.out.println("Der ggt von 18 ist: " +c);
	System.out.println("Alle Teiler von 18 ergeben die Summe: " +sum);
	
	}
}















































