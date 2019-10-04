package basics;

public class practice {

//	
//	Write a program(WAP) to print the factorial of a given number using for loop.

	static int m = 0;
	public static void main(String[] args) {
		System.out.println(factorial(21));
		
	}public static int factorial(int n) {
		if(n<=0) return 1;
		else if (n<3) {
			return n;
		}
		else 
			for(int i=0;i<n;i++) {
			 m = n*(n-1);
			}
			return m;
		
	}
	
	
	
	
	
}
