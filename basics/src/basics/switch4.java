package basics;

import java.util.Scanner;

public class switch4 {
	
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Choose from  the respective options\n 1.addition \n 2.division \n 3.square root \n 4.Is prime ");
			Scanner scan = new Scanner(System.in);
		
		switch (scan.nextInt()) {
		
			case 1:
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(addition(a, b));
				break;
			case 2:
				int a1 = scan.nextInt();
				int b1 = scan.nextInt();
				System.out.println(division(a1, b1));
				break;
			case 3:
				int a2 = scan.nextInt();
				System.out.println(sqrtu(a2));
				break;
			case 4:
				int a3 = scan.nextInt();
				System.out.println(prime(a3));
				break;
			default:
				System.exit(0);
		}
		}}
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
		
	 }}