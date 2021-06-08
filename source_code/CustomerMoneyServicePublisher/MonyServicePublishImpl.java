package customermoneyservicepublisher;

import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MonyServicePublishImpl implements MonyServicePublish{

	
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Scanner myObj = new Scanner(System.in); 
    double depamt;
    double newbalance;
    String updatebalance;
    String transaccname;
    String transamt;
    
	public String publishService() {
		

		return "---  Executing the Initial Publish Service of >>>  Money Service  ------------";
	}


	public boolean chechaccBalance(String balance) {
		
		System.out.println("-------------------------------------------------------------RDB-----");

    	System.out.println("");
    	
    	System.out.println("Your Current Account Balance is :- ");
    	System.out.println("Rs."+ balance);

		System.out.println("-------------------------------------------------------------RDB-----");
		return true;
	}
	
	
	
	public String DepositMoney(String balance) {
		
		System.out.println("-------------------------------------------------------------RDB-----");

		System.out.println("");
    	System.out.println("Currently You have Rs."+balance+" at your Account");
    	
    	System.out.println("");
    	
    	System.out.println("Please Enter the Amount You Want to Deposit in your Account :- ");
    	System.out.print("Rs.");
    	depamt = myObj.nextDouble();
    	
    	System.out.println("");
    	System.out.println("Verify your Amount of Money Again Please::-");
    	System.out.print("Rs.");
 		depamt = myObj.nextDouble();
 		
 		newbalance = depamt + Double.parseDouble(balance);
    	
    	//Out Minus
    	
    	if(depamt>0) {

     		System.out.println("-------------------------------------------------------------RDB-----");
     		System.out.println("");
        	System.out.println("Your New Account Balance is::-");
        	System.out.print("Rs."+newbalance);
        	
    		updatebalance = Double.toString(newbalance); 
    	}
    	else {
    		System.out.println("-------------------------------------------------------------RDB-----");
     		System.out.println("");
     		System.out.println("You can't Enter (-) Values for Depositing Process !, Deal Cancelled");
     		System.out.println("");
        	System.out.println("Your Account Balance is not Updated ::-");
        	System.out.print("Rs."+balance);
        	System.out.println("");
     		System.out.println("-------------------------------------------------------------RDB-----");
     		updatebalance = balance ;  
     		
    	}
    	
	
    	System.out.println("");
 		System.out.println("Thanks !");
 		System.out.println("");
 		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");
		
 		
 		return updatebalance;
	}
	

	
	
public String WithdrowMoney(String balance) {
		
		System.out.println("-------------------------------------------------------------RDB-----");

		System.out.println("");
    	System.out.println("Currently You have Rs."+balance+" at your Account");
    	
    	System.out.println("");
    	
    	System.out.println("Please Enter the Amount you want to Withdrow from your Account :- ");
    	System.out.print("Rs.");
    	depamt = myObj.nextDouble();
    	
    	System.out.println("");
    	System.out.println("Verify your Amount of Money Again Please::-");
    	System.out.print("Rs.");
 		depamt = myObj.nextDouble();
 		
 		newbalance = Double.parseDouble(balance) - depamt;
 		
       
    	if(depamt>0) {
    		
    	if(newbalance>0) {

     		System.out.println("-------------------------------------------------------------RDB-----");
     		System.out.println("");
     		System.out.println("Rs."+ depamt + " Deducted from your Account !");
     		System.out.println("Please Take out your Money!");
     		System.out.println("");
     		
        	System.out.println("Your New Account Balance is::-");
        	System.out.print("Rs."+newbalance);
    		
        	System.out.println("");
        	System.out.println("");
     		System.out.println("Thanks !");
     		System.out.println("");
     		System.out.println("-------------------------------------------------------------RDB-----");
     		System.out.println("");
     		
    		updatebalance = Double.toString(newbalance); 
    	}else {
    		System.out.println("-------------------------------------------------------------RDB-----");
     		System.out.println("");
     		System.out.println("This Deal may Create (-) Balance of your Account !, Deal Cancelled");
     		System.out.println("");
        	System.out.println("Your Account Balance is not Updated ::-");
        	System.out.print("Rs."+balance);
        	System.out.println("");
     		System.out.println("-------------------------------------------------------------RDB-----");
     		updatebalance = balance ;  
     		
    	}
    	
    	}
    	else {
    		System.out.println("-------------------------------------------------------------RDB-----");
    		System.out.println("");
     		System.out.println("You can't Enter (-) Values for Depositing Process !, Deal Cancelled");
     		System.out.println("");
        	System.out.println("Your Account balance is not Updated::-");
        	System.out.print("Rs."+balance);
        	System.out.println("");
     		System.out.println("-------------------------------------------------------------RDB-----");
     		updatebalance = balance ;  
     		
    	}
    	
	
    	System.out.println("");
 		System.out.println("Thanks !");
 		System.out.println("");
 		System.out.println("-------------------------------------------------------------RDB-----");
 		
 		return updatebalance;
	}
	
	
	


public String Transaction(String balance) {
	
	System.out.println("-------------------------------------------------------------RDB-----");

	System.out.println("");
	System.out.println("Currently You have Rs."+balance+" at your Account");
	
	System.out.println("");
	
	System.out.println("Please Enter the Amount You Want to use for this Transaction from your Account :- ");
	System.out.print("Rs.");
	depamt = myObj.nextDouble();
	
	System.out.println("");
	System.out.println("Verify your Amount of Money Again Please::-");
	System.out.print("Rs.");
	depamt = myObj.nextDouble();
		
	
	 System.out.print("Enter the Account That you want to make the Transaction ::- ");
	 try {
		 transaccname = in.readLine();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 
	newbalance = Double.parseDouble(balance) - depamt;
		
	if(depamt>0) {
		
		if(newbalance>0) {
			
			System.out.println("-------------------------------------------------------------RDB-----");
			System.out.println("");
			System.out.println("");
				
			System.out.println("Your New Account Balance is::-");
			System.out.print("Rs."+newbalance);
			
			System.out.println("");
			System.out.println("");
			System.out.println("Thanks !");
			System.out.println("");
			System.out.println("-------------------------------------------------------------RDB-----");
			System.out.println("");
			
			
			updatebalance = Double.toString(newbalance);  
			transamt = Double.toString(depamt); 
		}
		else {
			System.out.println("-------------------------------------------------------------RDB-----");
	 		System.out.println("");
	 		System.out.println("This Deal may Create (-) Balance of your Account !, Deal Cancelled");
	 		System.out.println("");
	    	System.out.println("Your Account balance is not Updated ::-");
	    	System.out.print("Rs."+balance);
	    	System.out.println("");
	 		System.out.println("-------------------------------------------------------------RDB-----");
	 		updatebalance = balance ;
	 		transamt = "0"; 
		}
			
	 }
	else {
		
		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");
 		System.out.println("You are not Alloweded to Transfer (-) Amount of Money for Transferring Process !");
 		System.out.println("");
    	System.out.println("The Worng Amount you Entered is::-");
    	System.out.print("Rs."+depamt);
    	System.out.println("");
 		System.out.println("-------------------------------------------------------------RDB-----");
 		updatebalance = balance ;
 		transamt = "0"; 
 		
	}
	
	return updatebalance + "~" + transaccname+ "~" + transamt;
	
}






public boolean showTotal(double balance) {
	System.out.println("-------------------------------------------------------------RDB-----");

	System.out.println("");
	
	System.out.println("The Remaining Money Amount of RDB Basic is :- ");
	System.out.println("Rs."+ balance);

	System.out.println("-------------------------------------------------------------RDB-----");
	return true;
}


public String updamt() {

	String interest = null;
    System.out.println("-------------------------------------------------------------RDB-----");
   	System.out.println("");
   	System.out.println("                    -- ADD THE INTEREST FOR CUSTOMER ACCONTS --                 ");
   	System.out.println("");
   	System.out.print("Please Enter the Percentage(%) that you need to Increase All the Customor Accounts::- ");
   	System.out.println("::-- ");
	 try {
		 interest = in.readLine();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("-------------------------------------------------------------RDB-----");
	return interest;
}



public String deleteaccont() {
	
	String delaccname = null;
    System.out.println("-------------------------------------------------------------RDB-----");
   	System.out.println("");
   	System.out.println("                    -- DELETING THE CUSTOMER ACCONTS --                 ");
   	System.out.println("");
   	System.out.print("Please Enter the Customer Account Name that you want to Delete::- ");
   	System.out.println("::-- ");
	 try {
		 delaccname = in.readLine();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 
	 System.out.println("");
	 System.out.print("Please Confirm the the Customer Account Name Again that you want to Delete::- ");
	 System.out.println("::-- ");
		 try {
			 delaccname = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	System.out.println("-------------------------------------------------------------RDB-----");
	return delaccname;
}
	


}
