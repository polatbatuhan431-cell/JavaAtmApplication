package atmApplication;
import java.util.Scanner;

public class AtmApplication 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		 
		double balance=10000.0;
		int choice;
		
		int password;
		
		do {
		System.out.println("Please Enter the Password: ");
		password = scanner.nextInt();
		if(password==1234)
		{ 
			System.out.println("Welcome!");
		}
		else 
		{
			System.out.println("Password is Wrong! Please try again.");
		}
		} while (password !=1234);
		
		do 
		{
			System.out.println(" ");
			System.out.println("---ATM System---");
			System.out.println("1-) Check Balance");
			System.out.println("2-) Deposit Money");
			System.out.println("3-) Withdraw Money");
			System.out.println("4-) Exit");
			System.out.println("--Please Select an Option (1-4)--");
			
			choice = scanner.nextInt();
			
			switch (choice) 
			{
				case 1:
					System.out.println("Current Balance: " + balance + "$");
					break;
					
				case 2:
					System.out.println("Enter Amount to Deposit: ");
					double depositAmount= scanner.nextDouble();
					if(depositAmount > 0) 
					{
						balance+= depositAmount;
						System.out.println("New Balance: "+ balance + "$");
					}
					else
					{
						System.out.println("Invalid Amount");
					}
			break;
				case 3:
					System.out.println("Enter Amount to Withdraw: ");
					double withdrawAmount= scanner.nextDouble();
					if(withdrawAmount > balance)
					{				
						System.out.println("Insufficient balance");
					}
					else if (withdrawAmount > 0)
					{
						balance -= withdrawAmount;
						System.out.println("New Balance: "+ balance + "$");
					}
					else 
					{
						System.out.println("Invalid Amount");
					}
			break;
				case 4:
					System.out.println("Exiting system. Have a nice day!");
			break;	
			
				default:
				    System.out.println("Invalid choice, please enter a number between 1 and 4.");
				    break;
			}
			
		} while(choice !=4);
	}
}