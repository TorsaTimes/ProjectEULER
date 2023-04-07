
public class MultiplesOf3And5 {

public static void main (String [] args) {
	
	int a = 3;
	int b = 5;
	
	int limit = 1000;
	
	
	int result = 0;
	for (int i = 0; i < limit; i++) {
	  if (i % a == 0 || i % b == 0) {
	    result += i;
	  }
	}
	System.out.println(result);


}





}
