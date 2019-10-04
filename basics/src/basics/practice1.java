package basics;

public class practice1 {
 
 

	    public static void main(String[] args) {
	    	
	    	
	        int a = 20, b = 50;
	        while (a < b) {
	            boolean bo = false;
	            for(int i = 2; i <= a/2; ++i) {
	                 
	                if(a % i == 0) {
	                    bo = true;
	                    break;
	                }
	            }
	            if (!bo)
	                System.out.print(a + " ");
	            ++a;
	        }
	    }
	}
	
	
