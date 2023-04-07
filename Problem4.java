
public class Problem4 {

	public static int Palindrom() {
		
		
		int total = 0;
		
		for( int i = 999;i>=900;i--)
		{
			for(int j = 999;j>=900;j--)
			{
				total = i*j;
				String s = Integer.toString(total);
				String s2 = new StringBuffer(s).reverse().toString();
				if(s.equals(s2))
					return total;
					
			
			
			}
			
		}
		
	return 0;

		   
	}
	
	
	public static void main(String[] args) {
		
		int result = Palindrom();
		System.out.println(result);
		
		
		
		
		
		
	}
} 
		
		
		
		
		
		
		
		
		
		
	
	
	
	

