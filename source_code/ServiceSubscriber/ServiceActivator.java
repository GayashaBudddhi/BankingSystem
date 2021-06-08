package servicesubscriber;

import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import servicepublisher.ServicePublish;
import administratorservicepublisher.AdministratorServicePublish;
import customermoneyservicepublisher.MonyServicePublish;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReferance;

	public void start(BundleContext context) throws Exception {
		

		System.out.println("-------- Service Subscriber---------------- (by, IT19062884 ) - Successflly Started --------");
		System.out.println("----*******************************************************************************----");
		System.out.println();
		System.out.println("------------------- WELCOME TO RDB BANK SYSTEM BY GROUP :- 2021S1_REG_WD_09 --------------------");
		System.out.println("");
		System.out.println("OSGI-Applications, Module :- SA, Assignment :-01 ");
		System.out.println("");
		System.out.println("");

		
		//***Publisher 1 start
		serviceReferance = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) context.getService(serviceReferance);
		
		System.out.println(servicePublish.publishService());
		
		
		//***Publisher 2 start
		serviceReferance = context.getServiceReference(MonyServicePublish.class.getName());
		MonyServicePublish servicePublish2 = (MonyServicePublish) context.getService(serviceReferance);
		
		System.out.println(servicePublish2.publishService());
		
		//***Publisher 3 start
		serviceReferance = context.getServiceReference(AdministratorServicePublish.class.getName());
		AdministratorServicePublish servicePublish3 = (AdministratorServicePublish) context.getService(serviceReferance);
		
		System.out.println(servicePublish.publishService());
		
	

        try
        {
        	
       	// Loop endlessly.
        	
		while (true){
			
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Scanner myObj = new Scanner(System.in);

            System.out.println("");
            System.out.println("");
           
            System.out.println("-------------------------------------------------------------RDB-----");
        	System.out.println("");
        	System.out.println("                    -- WELCOME TO RDB BANK SYSTEM --                 ");
        	
        	System.out.println("*Plese choose your initial service type :- ");
        	System.out.println("");
            System.out.println("***If you are  a , CUSTOMER                         please enter 1 ");
            System.out.println("***If you are  a , ADMINISTRATOR                    please enter 2 ");
            System.out.println("***To EXIT from the whole system Press               ANY OTHER KEY ");
			System.out.println("::-- ");
			String selection1 = in.readLine();
			System.out.println("");
			
			System.out.println("-------------------------------------------------------------RDB-----");
			
			if(selection1.equals("1")) {
            	
            	while(true) {
              
            	System.out.println("");
            	System.out.println("                    -- WELCOME OUR VALUABLE CUSTOMER --                 ");
            	
            	System.out.println("*Plese choose your initial service type :- ");
            	System.out.println("");
                System.out.println("***To LOGIN as a , CUSTOMER              please enter 3  ");
                System.out.println("***To CREATE new customer account        please enter 4  ");
                System.out.println("***To MOVE step Back <<<                 please enter 22 ");
                
    			System.out.println("::-- ");
    			String selection2 = in.readLine();
    			System.out.println("");
    			System.out.println("-------------------------------------------------------------RDB-----");
            
    			 if(selection2.equals("3")) {
    			
    				 while(true) {
               
    					 System.out.println("-------------------------------------------------------------RDB-----");
    					 System.out.println("");
    					 System.out.println("           -- CUSTOMER ACCOUNT LOGIN FORUM --            ");
            	
    					 System.out.println("");
    					 System.out.println("***To MOVE step Back <<< Plese enter - Y ,( Oterwise,just pass any ) ::-");
    					 String back1 = in.readLine();
    					 
    					 
    					 if((back1.equals("Y"))||(back1.equals("y"))) {
    						 break;
    					 }
    					 
    					 System.out.println("");
    					 System.out.println("");
    					 System.out.println("");
    					 // Ask the user to enter a accname.
    					 System.out.print("Enter your Account Name Please:: ");
    					 String accname = in.readLine();
    					 // Ask the user to enter a pwd.
    					 System.out.print("Enter your Account Password Please:: ");
    					 String pwd = in.readLine();
    					 System.out.println("");
    					 System.out.println("-------------------------------------------------------------RDB-----");
    					 System.out.println("");
    					 // If the user entered a blank line, then
    					 // exit the loop.
				
    					 	if (accname.length() == 0)
    					 		{
    					 		    System.out.println("You can't leave it as space");
    					 		}
    					 	else if (servicePublish.checkpwd(accname,pwd))
    					 		{
    					 		
    					 		
    					 			System.out.println("You have successfully logged In. Thanks !");
    					 			System.out.println("");
    					 			System.out.println("-------------------------------------------------------------RDB-----");
                	
    					 			while(true) {
    					 			
    				            	System.out.println("");
    				            	System.out.println("                    -- WELCOME "+accname+" --                 ");
    				            	
    				            	System.out.println("*Plese choose your service type :- ");
    				            	System.out.println("");
    				                System.out.println("***To CHANGE account name               please enter 5  ");
    				                System.out.println("***To CHANGE account password           please enter 6  ");
    				                System.out.println("***To Check your account balance        please enter 7  ");
    				                System.out.println("***To Deposit Money for account         please enter 8  ");
    				                System.out.println("***To Withdrow Money form account       please enter 9  ");
    				                System.out.println("***To Make a money transaction          please enter 10 ");
    				                System.out.println("***To LOG OUT                           please enter 24 ");
    				                
    				    			System.out.println("::-- ");
    				    			String selection3 = in.readLine();
    				    			System.out.println("");
    				    			System.out.println("-------------------------------------------------------------RDB-----");
    					 		
    				    			
    				    			
    				    			
    				    		    if(selection3.equals("5")) {
    				    		    	
    				    		    	if(servicePublish.changeaccname(accname,pwd)) {
    				    		    		
    				    		    		System.out.println("You have successfully change your Account Name, Thanks !");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	    					 			break;
    				    		    	}
    				    		    	else {
    				    		    		
    				    		    		System.out.println("SORRY ! please try again later");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    				    		    	}
    				    		    }
    				    		    
    				    		    
    				    		    else if(selection3.equals("6")) {
    				    		    	if(servicePublish.changepwd(accname,pwd)) {
    				    		    		
    				    		    		System.out.println("You have successfully change your Account Password, Thanks !");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	    					 			break;
    				    		    	}
    				    		    	else {
    				    		    		
    				    		    		System.out.println("SORRY ! please try again later");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    				    		    	}
    				    		    }
    				    		    
    				    		    
    				    		    else if(selection3.equals("7")) {
    				    		    	if(servicePublish2.chechaccBalance(servicePublish.getbalance(accname, pwd))) {
    				    		    
    				    		    	       System.out.println("");
    				    		    	     }
    				    		    	else {
    				    		    		
    				    		    		System.out.println("SORRY ! There is an error at Checking account balance !, Please Try again later");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    				    		    	}
    				    		    }
    					 		
    				    		    else if(selection3.equals("8")) {
    				    		    	if(servicePublish.updatebalance(accname, pwd, servicePublish2.DepositMoney(servicePublish.getbalance(accname, pwd))))
    				    		    		 {
    				    		    
    				    		    	          System.out.println("");
    				    		    	     }
    				    		    	else {
    				    		    		
    				    		    		System.out.println("SORRY ! There is an error at Depositing The Mony !, Please Try again later");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    				    		    	}
    				    		    }
    					 		
    				    		    
    				    		    else if(selection3.equals("9")) {
    				    		    	
    				    		    	if(servicePublish.updatebalance(accname, pwd, servicePublish2.WithdrowMoney(servicePublish.getbalance(accname, pwd))))
    				    		    		 {
    				    		    
    				    		    	          System.out.println("");
    				    		    	     }
    				    		    	else {
    				    		    		
    				    		    		System.out.println("SORRY ! There is an error at Depositing The Mony !, Please Try again later");
    	    					 			System.out.println("");
    	    					 			System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    				    		    	}
    				    		    }
    				    		    
    				    		    else if(selection3.equals("10")) {
    				    		    	
    				    		    	 String[] arry = servicePublish2.Transaction(servicePublish.getbalance(accname, pwd)).split("~");
    				    		    	 
    				    		    	 servicePublish.updatebalance(accname, pwd,arry[0]);
    				    		    	 servicePublish.updatebalance2(arry[1],arry[2]);
    				    		   
    				    		    }
    				    		    
    				    		    else if(selection3.equals("24")) {	 
    				         	    	
    				                    System.out.println("------- <<<<< Moving Previos Menu (LOGIN) <<<<<<  ---------------------------");
    				                    System.out.println("-------------------------------------------------------------RDB-----");
    				                    break;
    				                
    				    		    } 
    			    			 
    				    		    else {	 
    			      	    	
    				    		    	System.out.println("--- Invalid Choice ! ,Please enter Number from the Menu ! -----------");
    				    		    	System.out.println("-------------------------------------------------------------RDB-----");
    			             
    				    		    } 	
    				    		    
    				    		    }//While over
    				    		    
    					 		}
    					 	else
    					 		{
    					 			System.out.println("Please Enter Valid Details Again Please !");
    					 			System.out.println("");
    					 			System.out.println("-------------------------------------------------------------RDB-----");
                	
    					 		}       
                
    				 	
    				 }//While over
    			 }//selection2 - log account over
    			 
    	     else if(selection2.equals("4")) {	 
    	    	
    	    	 	    if (servicePublish.CreateAccount())
    	                {
    	                    System.out.println("You have successfully created account Thanks !");
    	                    System.out.println("");
    	                    System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    	                }
    	                else
    	                {
    	                    System.out.println("sorry account registation fail !");
    	                    System.out.println("");
    	                    System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    	                }
    	    }
    			 
    	     else if(selection2.equals("22")) {	 
     	    	
	                    System.out.println("------- <<<<< Moving Previos Menu <<<<<<  ---------------------------");
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    break;
	                
	         } 
    			 
    	     else {	 
      	    	
                 System.out.println("--- Invalid Choice ! ,Please enter Number from the Menu ! -----------");
                 System.out.println("-------------------------------------------------------------RDB-----");
             
    	     } 	 
    			 
            	}//While over	 
        
        }// customer over
			else if(selection1.equals("2")) {
		       
            	System.out.println("");
            	System.out.println("             -- WELCOME OUR  ADMINISTRATOR --                 ");
            	
            	String charactor = servicePublish3.Login();
            	
            	System.out.println("             -- charactor == -- " + charactor+" -- ");
            	
            	if (charactor.equals("Not_Recognized"))
    	 		{
            		System.out.println("Please Enter Valid Details Again Please !");
            		System.out.println("");
            		System.out.println("-------------------------------------------------------------RDB-----");
           		
    	 		}
            	else if (charactor.equals("Accountant"))
    	 		{
            		while(true) {
            			
            		
            		System.out.println("*Plese choose your service type :- ");
	            	System.out.println("");
	                System.out.println("***To CHANGE your account password                                         please enter 16  ");
	                System.out.println("***To CALCLATE the Total Depossited Amount by customers on the bank        please enter 17  ");
	                System.out.println("***To DELETE particlar customer accouunt                                   please enter 18  "); 
	                System.out.println("***To calculate the interests of the acconts (daily/weekly/monthly)        please enter 19  "); 
	                System.out.println("***To VIEW the detailled list of all the existing customer accounts	     please enter 20  ");
	                System.out.println("***To LOG OUT                                                              please enter 25  ");
	                
	                
	    			System.out.println("::-- ");
	    			String selection4 = in.readLine();
	    			System.out.println("");
	    			System.out.println("-------------------------------------------------------------RDB-----");
	    			
	    			if(selection4.equals("16")) {
	    		    	if(servicePublish3.changepwd()) {
	    		    		
	    		    		System.out.println("You have successfully changed your Account Password, Thanks !");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
				 			break;
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			
	    			else if(selection4.equals("17")) {
	    				
	    		    	if(servicePublish2.showTotal(servicePublish.getTotal())) {
	    		 
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			
	    			else if(selection4.equals("19")) {
	    				
	    		    	if(servicePublish.increasetotal(servicePublish2.updamt())) {
	    		 
				 			System.out.println("");
				 			System.out.println("");
				 			System.out.println("You have successfully updated all the customer account balances with given Interest Rate, Thanks !");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			
	    			else if(selection4.equals("20")) {
	    				
	    		    	if(servicePublish.getacclist()) {
	    		 
				 			System.out.println("");
        	
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			
	    			else if(selection4.equals("18")) {
	    				
	    		    	if(servicePublish.deleteaccont(servicePublish2.deleteaccont())) {
	    		 
				 			System.out.println("");
        	
	    		    	}
	    		    	else {
	    		    		
				 			System.out.println("-------------------------------------------------------------RDB-----");
				 			System.out.println("");
	    		    		System.out.println("SORRY ! you entered accont is already not existing on the RDB base !");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    } else if(selection4.equals("25")) {	 
     	    	
	                    System.out.println("------- <<<<< Moving Previos Menu <<<<<<  ---------------------------");
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    break;
	                
	    		    } 
    			 
	    		    else {	 
      	    	
	    		    	System.out.println("--- Invalid Choice ! ,Please enter Number from the Menu ! -----------");
	    		    	System.out.println("-------------------------------------------------------------RDB-----");
             
	    		    	} 	 
	    			
            		}//End While
    	 		}
            	
            	else if(charactor.equals("HeadAdmin")){
            		
            		while(true) {
            	
            		System.out.println("*Plese choose your service type :- ");
	            	System.out.println("");
	                System.out.println("***To ADD New Administrator account                    please enter 11  ");
	                System.out.println("***To CHANGE your account password                     please enter 12  ");
	                System.out.println("***To OPERATE other Administrator Accounts             please enter 13  ");
	                System.out.println("***To VIEW the list ofAdministrator Accounts           please enter 21  ");
	                System.out.println("***To LOG OUT                                          please enter 26  ");
	                
	    			System.out.println("::-- ");
	    			String selection5 = in.readLine();
	    			System.out.println("");
	    			System.out.println("-------------------------------------------------------------RDB-----");
	    			
	    			if(selection5.equals("11")) {	 
	        	    	
    	    	 	    if (servicePublish3.CreateAccount())
    	                {
    	                    System.out.println("You have successfully created new admin accont Thanks !");
    	                    System.out.println("");
    	                    System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    	                }
    	                else
    	                {
    	                    System.out.println("sorry yor new administrator account registation has failled !");
    	                    System.out.println("");
    	                    System.out.println("-------------------------------------------------------------RDB-----");
    	                	
    	                }
	    			}
	    			else if(selection5.equals("12")) {
	    		    	if(servicePublish3.changepwd()) {
	    		    		
	    		    		System.out.println("You have successfully changed your Account Password, Thanks !");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			else if(selection5.equals("21")) {
	    		    	if(servicePublish3.viewadminlist()) {
	    		    		
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("SORRY ! please try again later");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    }
	    			else if(selection5.equals("13")) {
	    				
	    		    	if(servicePublish3.serchAccount()) {
	    		    		
	    		    		System.out.println("*What are you wishing to do for the account :- ");
	    	            	System.out.println("");
	    	                System.out.println("***To change the account details                     please enter 14  ");
	    	                System.out.println("***To delete the account                             please enter 15  ");
	    	                System.out.println("***PRESS any other KEY to go back <<<                                 ");
	    	                
	    	    			System.out.println("::-- ");
	    	    			String selection6 = in.readLine();
	    	    			System.out.println("");
	    	    			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    	    			if(selection6.equals("14")) {	 
	    	        	    	
	        	    	 	    if (servicePublish3.ChangeSerchedAccountDetails())
	        	                {
	        	                    System.out.println("You have successfully change that accont details !");
	        	                    System.out.println("");
	        	                    System.out.println("-------------------------------------------------------------RDB-----");
	        	                	
	        	                }
	        	                else
	        	                {
	        	                    System.out.println("sorry account changing process has failled !");
	        	                    System.out.println("");
	        	                    System.out.println("-------------------------------------------------------------RDB-----");
	        	                	
	        	                }
	    	    			}
	    	    			else if(selection6.equals("15")) {
	    	    				
	    	    		    	if(servicePublish3.DeleteSerchedAccount()) {
	    	    		    		
	    	    		    		System.out.println("You have successfully deleted that account, Thanks !");
	    				 			System.out.println("");
	    				 			System.out.println("-------------------------------------------------------------RDB-----");
	            	
	    	    		    	}
	    	    		    	else {
	    	    		    		
	    	    		    		System.out.println("Sorry ! account deleting process has failled ! ");
	    				 			System.out.println("");
	    				 			System.out.println("-------------------------------------------------------------RDB-----");
	            	
	    	    		    	}
	    	    		    }
	    		    	}
	    		    	else {
	    		    		
	    		    		System.out.println("Sorry ! account Accessing Failled ! ");
				 			System.out.println("");
				 			System.out.println("-------------------------------------------------------------RDB-----");
        	
	    		    	}
	    		    	
	    		    	
	    		    	
	    		    } else if(selection5.equals("26")) {	 
     	    	
	                    System.out.println("------- <<<<< Moving Previos Menu <<<<<<  ---------------------------");
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    break;
	                
	    		    } 
    			 
	    		    else {	 
      	    	
	    		    	System.out.println("--- Invalid Choice ! ,Please enter Number from the Menu ! -----------");
	    		    	System.out.println("-------------------------------------------------------------RDB-----");
             
	    		    	} 	
            		}//End while
            	}
            	
            	else
    	 		{
            		System.out.println("Please Enter Valid Details Again Please !(Error at login Methord !)");
            		System.out.println("");
            		System.out.println("-------------------------------------------------------------RDB-----");
           		
    	 		}//End of administrator head's works	
            	
            	
			}else
	 		{
				System.out.println("-------------------------------------------------------------RDB-----");
				System.out.println("");
				System.out.println("YOU ARE LEAVING THE RDB BANKING SYSTEM - THANK YOU FOR BEING WITH US !");
				System.out.println("");
				System.out.println("-------------------------------------------------------------RDB-----");
				break;
       		
	 		}//End of main choice one	
			
			
			
			  } //End of Main while loop	
		
		
		    System.out.println("");
	        System.out.println("");
	        System.out.println("");
	        System.out.println("-------------------------------------------------------------RDB-----");
	    	System.out.println("---THANK YOU FOR ALL THE BANKING METHORDS !                  --------");
	    	System.out.println("");
	    	System.out.println("");
	    	System.out.println("---Creatrion by :- 2021S1_REG_WD_09 Group");
	    	System.out.println(" Member One   :- IT19062884 , A.G.Ruvindu Kaushalya , Function:-ServiceSubscriber            ");
	    	System.out.println(" Member Two   :- IT19061580 , Amarasinghe A.A.B.G   , Function:-ServicePublisher             ");
	    	System.out.println(" Member Three :- IT19057248 , G L I R Liyanage      , Function:-CustomerMonyServicePublisher ");
	    	System.out.println(" Member Four  :- IT19098838 , Wangchen T            , Function:-AdministratorServicePublisher");
	    	
	    	System.out.println("");
	    	System.out.println("");
	    	System.out.println("-------------------------------------------------------------RDB-----");
		
	  } catch (Exception ex) { } //Exception handling
	  
	  
	} 
	  
	public void stop(BundleContext context) throws Exception {
		System.out.println("--- Subscriber CLASS STOPPED --------------- !!!");
		System.out.println(serviceReferance);
		System.out.println("");
	}
 
}
