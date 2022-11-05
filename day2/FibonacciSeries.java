package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		firstTerm =  0
//		secondTerm = 1
//		nextTerm = firstTerm + secondTerm; (0 + 1)
//		firstTerm = secondTerm; (1)
//		secondTerm = nextTerm; (1)
//
//		nextTerm = firstTerm + secondTerm; (1 + 1)
		
		int range = 7,
		firstTerm = 0,
		secondTerm = 1;
		
		int sum;
        
		System.out.println(firstTerm);
		System.out.println(secondTerm);
	    
		for(int i=1;i<range-1;i++)
		{
	    	
			sum=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=sum;
			
			System.out.println(sum);
	    }
	  }
}
