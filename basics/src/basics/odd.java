package basics;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.println("enter tewo numbers");
		Scanner scan = new Scanner(System.in);
		int j =1;
		int sum = 0;
		int o = scan.nextInt();
		for(int i=0;i<o;i++) {
			
			System.out.println(j);
			j = j+2;
			 sum = sum + j; 
			 
		}System.out.println(sum);
		
	}
	
}
