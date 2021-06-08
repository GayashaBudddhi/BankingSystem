package administratorservicepublisher;

import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class AdministratorServicepublishImpl implements AdministratorServicePublish{
	
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String accname;
	String pwd;
	String position;
	
	String craccname;
	String crpwd;
	String crposition;
	
	String newpwd;
	
	String SRaccname;
	String SRpwd;
	String SRposition;
	int serchmark;
	
	
	String updccname;
	String updcrpwd;
	String updcrposition;
	
	String dis;
	
	String[][] A_Acconts = { {"Kaushalya", "1234","HeadAdmin"},{"Buddi", "456","HeadAdmin"},{"Tan", "789","HeadAdmin"},
			{"Ishini", "910","Accountant"},{"H", "h","HeadAdmin"},{"A", "a","Accountant"},{"Ron", "114","Accountant"},
			{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
			{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
			{"", "", ""},{"", "", ""},{"", "", ""}};
	
	//20 capacity - 7 Already created accounts
	    

	public String publishService() {

		return "---  Executing the initial publish service of >>>  Administrator Service  ----------------";
	}
	
	
		
	
	
	
	
	public String Login() {
		
		 String d ="Not_Recognized";
		
		 System.out.println("-------------------------------------------------------------RDB-----");
		 System.out.println("");
		 System.out.println("           -- ADMINISTRATOR ACCOUNT LOGIN FORUM --            ");

		 System.out.println("");
		 // Ask the Administrator to enter the name.
		 System.out.print("Enter Your Name Please:: ");
		try {
			accname = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int z = 1;
		while(z == 1) {
		
		try {
		 		System.out.print("Enter Your Position Please::(Accountant/HeadAdmin) ");
				position = in.readLine();
			
				if ((position.equals("Accountant"))||(position.equals("HeadAdmin")))
		 		{
					z = 5;	
		 		}
				else {
		 			z = 1;
		 		}
					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		 // Ask the Adminstrator to enter a pwd.
		
		 System.out.print("Enter your Adminstrator Account Password Please:: ");
		 try {
			 pwd = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		 System.out.println("");
		 System.out.println("-------------------------------------------------------------RDB-----");
		 System.out.println("");

		 	if (accname.length() == 0)
		 		{
		 		    System.out.println("You can't leave it as space");
		 		}
		 	else {
		 		
		 		
		 	        for (int i = 0; i < A_Acconts.length; i++)
		 	        {
		 	            if (A_Acconts[i][0].equals(accname))
		 	            {
		 	                 if (A_Acconts[i][1].equals(pwd))
		 					{
		 	                	  if (A_Acconts[i][2].equals(position))
				 					{

	    					 			System.out.println("Successflly Logged as "+ position +" Thanks !");
	    					 			System.out.println("");
	    					 			System.out.println("-------------------------------------------------------------RDB-----");

	    				            	System.out.println("");
	    				            	System.out.println("                    -- WELCOME "+accname+" --                 ");
				 					    d = position; 
				 					}
		 					}
		 	            }
		 	        }
		 	           
		 	   }
		 	
			return d;
		
	}
	
	
	
	
	
	
	
	
	@Override
	public boolean CreateAccount() {
		

 		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");
 		System.out.println("           -- ADMINISRATOR ACCOUNT CREATION FORUM --            ");

 		System.out.println("*(Can be only Accessed by Head Administrators)");
 		System.out.println("");
 		//enter new administrator name
 		System.out.println("Enter the name of New Administrator Name Please::");
		try {
			craccname = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
 		// Ask the admin to enter new pwd.
 		
		System.out.println("Enter the Name of New Administrator Account Password Please::");
 		
		try {
			 crpwd = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		// Ask the admin to enter a pwd again.
 		System.out.println("Confirm the Account Password Again Please::");
 		
		try {
			 crpwd = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		int m = 1;
		while(m == 1) {
		
		try {
			    System.out.println("Enter Assigning Role (Accountant/HeadAdmin) Please ::");
			    crposition = in.readLine();
			
				if ((crposition.equals("Accountant"))||(crposition.equals("HeadAdmin")))
		 		{
					m = 5;	
		 		}
				else {
		 			m = 1;
		 		}
					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
 		System.out.println("");
 		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");

 	   int check1 = 1;	
 		
 	   if (craccname.length() == 0)
        {
 		  System.out.println("You can't keep it as space !");
 		  check1 = 2;
        }
       
 	   else {
 		   
 	   
		  for (int i = 0; i < A_Acconts.length; i++)
	        {
	            if (A_Acconts[i][0].equals(craccname))
	            {
	                    System.out.println("");
	                    System.out.println("This name have already taken,Please use another part of name or your NIC number !");
	                    check1 = 2;
	                    System.out.println("");
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    
	                 if (A_Acconts[i][1].equals(crpwd))
	                 	{
	                	 	System.out.println("-------------------------------------------------------------RDB-----");
	                	 	System.out.println("");
	                	 	System.out.println("YOU are trying to ovride the existing account !,Seriol Security Error ! ");
	                	 	System.out.println("");
	                	 	System.out.println("-------------------------------------------------------------RDB-----");
	                	 	check1 = 2;
	                 	}
	            }
	        }   
		  
		  
		  if(check1 == 1) {
		         
		        for (int j = 0; j < A_Acconts.length; j++)
		      	        {
		      	            if (A_Acconts[j][0].equals(""))
		      	            {
		      	                 if (A_Acconts[j][1].equals(""))
		      					{
		      	                	 A_Acconts[j][0] = craccname;
		      	                	 A_Acconts[j][1] = crpwd;
		      	                	 A_Acconts[j][2] = crposition;
		      	                	 return true;
		      					}
		      	            }
		      	        }
			  
		  }
		  
 	   }
 	   
	        return false;
	}
	
	
	
	
	
	
	


	public boolean changepwd() {
      	
        for (int i = 0; i < A_Acconts.length; i++)
        {
            if (A_Acconts[i][0].equals(accname))
            {
                 if (A_Acconts[i][1].equals(pwd))
				{
                	 if (A_Acconts[i][2].equals(position)) {
	 					
         	 		System.out.println("-------------------------------------------------------------RDB-----");
	    	 		System.out.println("");
	    	 		System.out.println("           -- CHANGE YOR ADMIN ACCOUNT PASSWORD HERE "+accname+" --            ");
        	
	    	 		System.out.println("Enter your New Password Please:: (_We will asign this as your New Account password)");
	    	 		System.out.println(":-");
	    	 		try {
	    	 			newpwd = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		System.out.println("Verify your New Password again please::");
	    	 		System.out.println(":-");
	    	 		try {
	    	 			newpwd = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		A_Acconts[i][1] = newpwd;
	    	 		System.out.println("");
	    	 		System.out.println("-------------------------------------------------------------RDB-----");
	    	 		System.out.println("");
	    	
	    	 		return true;
				       }
				}
            }
        }
        return false;
    }



	public boolean serchAccount() {
		
		String d ="Not_Recognized";
		
		 System.out.println("-------------------------------------------------------------RDB-----");
		 System.out.println("");
		 System.out.println("           -- SERCH ADMINISTRATOR ACCONT --            ");

		 System.out.println("");
		 // Ask the Administrator to enter the name.
		 System.out.print("Enter the Name for searching process Please:: ");
		try {
			    SRaccname = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		  
		 System.out.println("");
		 System.out.println("-------------------------------------------------------------RDB-----");
		 System.out.println("");

		 	if (SRaccname.length() == 0)
		 		{
		 		    System.out.println("You can't leave it as space");
		 		}
		 	else {
		 		
		 		
		 	        for (int i = 0; i < A_Acconts.length; i++)
		 	        {
		 	            if (A_Acconts[i][0].equals(SRaccname))
		 	            {
		 	            	
		 	            	serchmark =i;
		 	            	System.out.println("Account Name that searched     :- "+SRaccname);
				 			System.out.println("");
				 			
				 			SRpwd=A_Acconts[i][1];
				 			System.out.println("Account Password that searched :- "+SRpwd);
				 			System.out.println("");
				 			
				 			SRposition=A_Acconts[i][2];
				 			System.out.println("Account Position that searched  :- "+SRposition);
				 			System.out.println("");
				 			
				 			System.out.println("-------------------------------------------------------------RDB-----");

				 			return true;
		 	            }
		 	        }
		 	           
		 	   }
		
		return false;
		
	}
	
	
	public boolean ChangeSerchedAccountDetails() {
		
			
			int check2 = 1 ;
		
		    
		    System.out.println("****Please enter the changes according to your want ----");
		    System.out.println("");
		
		    System.out.println("Account Name instered of,"+ SRaccname+" is =");
		    try {
		    	updccname = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			  for (int i = 0; i < A_Acconts.length; i++)
		        {
		            if (A_Acconts[i][0].equals(updccname))
		            {
		            	    System.out.println("-------------------------------------------------------------RDB-----");
		                    System.out.println("");
		                    System.out.println("This name have already taken,Please use another part of the person or his/her, NIC number !");
		                    System.out.println("Account Name did't updated !");
		                    System.out.println("");
		                    System.out.println("-------------------------------------------------------------RDB-----");
		                    check2 = 2 ;
		            }
		        } 
			  
			  System.out.println("");
			
			if(check2 == 1) {
				A_Acconts[serchmark][0] = updccname;
			}
			
			
			
			System.out.println("Account Password instered of,"+ SRpwd+" is =");
			try {
				updcrpwd = in.readLine();
				A_Acconts[serchmark][1] = updcrpwd; 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("");
			
			
			
			int p = 1;
			while(p == 1) {
			
			try {
				    System.out.println("Account Position instered of,"+ SRposition+" is =");
				    updcrposition = in.readLine();
				
					if ((updcrposition.equals("Accountant"))||(updcrposition.equals("HeadAdmin")))
			 		{
						p = 5;	
					    A_Acconts[serchmark][2] = updcrposition;
			 		}
					else {
			 			p = 1;
			 		}
						
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("");
			
			
			
			System.out.println("-------------------------------------------------------------RDB-----");

		
		return true;
		
	}
	
	
	
	public boolean DeleteSerchedAccount() {
		
		System.out.println("Are You Sure you want to delete it  ");
		System.out.println("**Press Y to continue** :- ");
		try {
			 dis = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if((dis.equals("Y"))||(dis.equals("y"))){
			
			A_Acconts[serchmark][0] ="";
			A_Acconts[serchmark][1] ="";
			A_Acconts[serchmark][2] ="";
			
			return true;
		}
		
	    System.out.println("");
	    
		return false;
		
	}
	
	
	
	
	public boolean viewadminlist() {
		  
		   int i=0;
		   int tot = 0;	
		   System.out.println("-------------------------------------------------------------RDB-----");
			System.out.println("");
			System.out.println("           -- FULL LIST OF CURRENTLY EXISTING ADMINISTRATORS AT RDB --            ");
		   
		   for ( i = 0; i < A_Acconts.length; i++)
	       {  
			   if(A_Acconts[i][0]=="") {
				   tot = tot;
			   }
			   else {
				   if(A_Acconts[i][1]=="") {
					   tot = tot;
				   }
				   else {
					   if(A_Acconts[i][2]=="") {
						   tot = tot;
					   }
					   else {

							System.out.println("");
					 		System.out.println("*** Administrator Name :- "+A_Acconts[i][0]+" ,AccontPassword :-  "+A_Acconts[i][1]);
					 		System.out.println("*** Assigned Position :- "+A_Acconts[i][2]);
					 		 tot = tot+1;
					   }
				   }
			   }
	       }
		   
		    System.out.println("");
		    System.out.println("");
		    System.out.println("-------------------------------------------------------------RDB-----");
		 	System.out.println("");
		    System.out.println("");
			System.out.println("Existing number of Administrators is:- "+tot);
			System.out.println("");
			System.out.println("-------------------------------------------------------------RDB-----");
	   
		return true;
		
	}
	
	
	
}
