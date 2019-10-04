package basics;

import java.util.Scanner;

public class Prac3 {
	
	
//	WAP by creating 4 methods add, division, square root, 
//	prime or not and the user choosing the respective options using if else condition.

	public static void main(String[] args) {
		while(true) {
		System.out.println("Choose from  the respective options\n 1.addition \n 2.division \n 3.square root \n 4.Is prime ");
		Scanner scan = new Scanner(System.in);
		
		if(scan.nextInt() == 1) {
			System.out.println("enter two numbers for addition");
			int a = scan.nextInt() ;
			int b = scan.nextInt() ;
			System.out.println(addition(a,b));
			 
		}
		else if(scan.nextInt() == 2 ) {
			System.out.println("enter two numbers for division");
			int a = scan.nextInt() ;
			int b = scan.nextInt() ;
			System.out.println(division(a, b));
		}
		else if(scan.nextInt() == 3) {
			System.out.println("enter two numbers for sqrt");
			int a = scan.nextInt() ;
 
			System.out.println(sqrtu(a));
		} 
		else if(scan.nextInt() == 4) {
			System.out.println("enter num to verify prime or not");
			int a = scan.nextInt();
			System.out.println(prime(a));
		}
		else  System.exit(0);
		}
	}
	 static int addition(int a, int b) {
		
		return a+b;
		
	}
	
	 static double division(int a, int b) {
		return a/b;
	}
	
	 static double sqrtu(int a) {
	
		return Math.sqrt(a);}
	
	 static boolean prime(int a) {
		 boolean bo = true;
        for(int i = 2; i <= a/2; ++i)
        {
        	if(a % i == 0)
            {
                bo = true;
                break;
            }
        }
        if(!bo) {
        	return true;
        }else
		return false;
		
	}
		
}
