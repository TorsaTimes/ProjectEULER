
public class Problem005 {

	public static long Teilbares() {
		
		long result = 0;
		long sum = 0;
		long limit1 = 3000;
		long limit2 = 10;
		
		
		for(long i = 1; i<=limit1;i++)
		{
			for(long j = 1;j<limit2;j++)
			{
				if(i % j == 0) {
					if(i % 10) 
						System.out.println(sum);
					
				
				}
						
						
				
				
				
	}
	
	
	
}
		return 0;
		
	}
		
		
	public static void main(String[] args) { 
	
		long answer = Teilbares();
		System.out.println(answer);
	
	
	}
}