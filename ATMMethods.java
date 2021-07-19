package com.ust;

import java.util.Scanner;
//The class for creating the ATM operations
public class ATMMethods {
	
	//To get the user inputs
	Scanner sc = new Scanner(System.in);

	//Declaring the variables
	int balance = 300000;
	int withdrawAmount;
	int p1;
	int pin=2312;
	
	
	
	
	//Defining the operations
	void Operations() {
		System.out.println("******Welcome HDFC Bank*******");
		System.out.println("Enter your choice : ");
		System.out.println("1. Withdraw");
		System.out.println("2 Check Balance");
		System.out.println("3 Change pin");
	
	//Switch is used for incooperating three options togother
	int choice  = sc.nextInt(); 
	
	switch(choice)
	{
	case 1:
		
		
		//Function for the cash withdraw
		System.out.println("Please enter amount to withdraw :");
		withdrawAmount = sc.nextInt();
		System.out.println("Please enter the  pin : ");
		int p3 = sc.nextInt();
			//To compare the amount entered by the user with the current balance
		if(p3==pin) {
		if(balance>=withdrawAmount)
		{
			balance = balance - withdrawAmount;
			System.out.println("Please collect your cash");
			System.out.println("........Thank you Visit Again.......");
			
	}
		else  
        {  
              
            System.out.println("Sorry you have Insufficient Balance");  
            System.out.println("Your current balance is : "+balance);
    		System.out.println("........Thank you Visit Again.......");
        } 
		}
		else {
			System.out.println("Please Enter a valid pin");
		}
        break;
        
	case 2:
		//Function for displaying the current balance in the account
		System.out.println("Please enter the  pin : ");
		int p4 = sc.nextInt();	
		if(p4==pin) {
		System.out.println("Your current balance is : "+balance);
		System.out.println("........Thank you Visit Again.......");
		}
		
		else {
			System.out.println("Please Enter a valid pin");
			
		}
		break;
		
	case 3:
		//Function for changing the current pin
		System.out.println("Please enter your current pin :");
		int p = sc.nextInt();
		if(p == pin)
		{
			
			System.out.println("Enter your new pin");
			 p1 = sc.nextInt();
			 pin=p1;
			System.out.println("........Your pin has been successfully changed.......");
			

			
	}
		else  
        {  
              
            System.out.println("Please enter a valid pin");  
            
        }  
        break;
		
		
      default :
    	  
    	  System.out.println("Please Enter a valid choice");
}
	
	
	//Function to continue the operation
	char ch;
	System.out.println("Do you want to continue	(y/n) :");
	ch = sc.next().charAt(0);
	if(ch == 'y') {
		 Operations();	
	}
	else {
		System.out.println("........Thank you Visit Again.......");
	}
	
	
	
	}
}
