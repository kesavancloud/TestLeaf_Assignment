package week1.day2;

public class Second_Small_Num {

	public static void main(String args[]) {
		
			int num[] = {23,45,67,32,89,22};
			
			int n=num.length;			
			Arrays.sort(num);
			
			System.out.println("Second smallest number " +num[1]);
		}

	}