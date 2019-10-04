package bankproject;

import java.util.Scanner;

public class PolicyName {

	public static void main(String[] args) {
	 
		int op = 0;
		int i = 0;
		Policy x = null;
		Scanner scan = new Scanner(System.in);
		PolicyLogic P = new PolicyLogic();
		
		
//		int numofPolicies = scan.nextInt();
		
		
		do {
			System.out.println("\n please choose from below options\r\n" + 
					"1. add policy 2. view policy 3. update policy 4.tag  customers 5. exit\r\n" + 
					"");
//			
			System.out.println("Enter a number");
			op = scan.nextInt();
			
			switch(op) {
				
			case 1:
				
				System.out.println("enter the num of policies you want");
//				if(scan.hasNextInt()) 	{i = scan.nextInt();
//				}
				
				int i1 = scan.nextInt();
				for(int j=0;j<i1;j++) {
					System.out.println("enter the policy name ");
					P.setPolicyname(scan.next());
					System.out.println("enter the policy ID");
					P.setPolicyId(scan.nextInt());

					System.out.println("enter the policy SumAssured");
					P.setSumAssured(scan.nextInt());
					
					System.out.println("enter the policy duration");
					P.setDuration(scan.nextInt());
					if(j!=i1) {
					System.out.println("enter the next p[olicy details");
					}
					x = new Policy(P.getPolicyname(),P.getPolicyId(),P.getSumAssured(), P.getDuration());
					P.addPolicy(x);
					

				}	System.out.println("you have succesfuly registered for policies");	
				break;
				
			case 2:
				
				System.out.println("View Policy");
				System.out.println("you have choosen to view policy");
				System.out.println("Please choose the option below \n 1. view all policies 2. view policy");
				int n = scan.nextInt();
				System.out.println(P.View());
				break;
			case 3:
				
				System.out.println("update policy");
				System.out.println("please enter new policy name");
				String s = scan.next();
//				P.setPolicyname(s);
				
				System.out.println("please enter new policy id");
				int a = scan.nextInt();
//				P.setPolicyId(a);
				
				System.out.println("please enter new policy sumAssured");
				int b = scan.nextInt();
//				P.setSumAssured(b);
				
				System.out.println("please enter new policy duration");
				int c = scan.nextInt();
//				P.setDuration(c);
				
				P.updatePolciy(s,a,b,c);
				break;
				
			}
			
		
		}
		while(op != 5);
		System.out.println("exit");
	}

}
