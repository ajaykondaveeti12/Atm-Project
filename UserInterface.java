package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AtmOperationImpl impl= new AtmOperationImpl();
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE ");
		System.out.println("Enter the Atm Number");
		int atmnum2=sc.nextInt();
		System.out.println("Enter the Atm pin");
		int atmpin2=sc.nextInt();
		if((atmnumber==atmnum2)&&(atmpin==atmpin2))
		{
			while(true)
			{
				System.out.println("1.view Balance\n 2.Withdraw Amount\n 3.Deposit amount\n 4.view ministatement\n 5.exit");
				System.out.println("Enter choice : ");
				int ch=sc.nextInt();
				if(ch==1)
				{
					impl.viewBalance();
				}
				else if(ch==2){
					System.out.println("Enter the withdraw Amount");
					double withdrawAmount=sc.nextDouble();
					impl.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
					System.out.println("Enter the Amount to Deposit: ");
					double depositAmount=sc.nextDouble();
					impl.depositAmount(depositAmount);
				}
				else if(ch==4) {
					impl.viewministatement();
				}
				else if(ch==5) {
					System.out.println("Collect your Atm card\n Thank you");
					System.exit(status);
				}
			}
				}
		else {
			System.out.println("Incorrect Atm Pin or Number");
		}
		
	}

}
