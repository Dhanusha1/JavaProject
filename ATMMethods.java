package com.ust;

import java.util.Scanner;

public class ATMMethods {
	
	Scanner sc = new Scanner(System.in);

	int balance = 300000;
	int withdrawAmount;
	int p1;
	int pin=2312;
	
	
	
	
	void Operations() {
		System.out.println("******Welcome HDFC Bank*******");
		System.out.println("Enter your choice : ");
		System.out.println("1. Withdraw");
		System.out.println("2 Check Balance");
		System.out.println("3 Change pin");
	
	
	int choice  = sc.nextInt(); 
	
	switch(choice)
	{
	case 1:
		
		System.out.println("Please enter amount to withdraw :");
		withdrawAmount = sc.nextInt();
		System.out.println("Please enter the  pin : ");
		int p3 = sc.nextInt();	
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
