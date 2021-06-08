package servicepublisher;

import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublishImpl implements ServicePublish{
	
	
		 
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String accname1;
    String pwd1;
    String accnewpwd;
    String accnewname;
    
    
    
	@Override
	public String publishService() {
		return "---  Executing the initial publish service of >>>  Initial Accont Service  ---";

	}

	
	
	
	
	String[][] m_Acconts = { {"Ruvindu", "123","10000"},{"Buddi", "456","20000"},{"Tan", "789","30000"},
		{"Ishini", "910","40000"},{"Harry", "112","50000"},{"Herminee", "113","60000"},{"Ron", "114","70000"},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},{"", "", ""},
		{"", "", ""},{"", "", ""},{"", "", ""}};
	
	//100 capacity - 7 Already created accounts
	
	@Override
	public boolean checkpwd(String accno,String pwd) {
	
        for (int i = 0; i < m_Acconts.length; i++)
        {
            if (m_Acconts[i][0].equals(accno))
            {
                 if (m_Acconts[i][1].equals(pwd))
				{
					return true;
				}
            }
        }
        return false;
    }

	
	@Override
	public String getbalance(String accno,String pwd) {
	
		String tes = null;
		
        for (int i = 0; i < m_Acconts.length; i++)
        {
            if (m_Acconts[i][0].equals(accno))
            {
                 if (m_Acconts[i][1].equals(pwd))
				{
                	 tes = m_Acconts[i][2];
				}
            }
        }
		
        return tes;
    }
	

	public boolean updatebalance(String accno,String pwd,String balance) {
		
        for (int i = 0; i < m_Acconts.length; i++)
        {
            if (m_Acconts[i][0].equals(accno))
            {
                 if (m_Acconts[i][1].equals(pwd))
				{
                	m_Acconts[i][2] = balance;
				}
            }
        }
		
        return true;
    }
	
	
	
	
	

	@Override
	public boolean CreateAccount() {
		

 		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");
 		System.out.println("           -- ACCOUNT CREATION FORUM --            ");

 		System.out.println("");
 		// Ask the user to enter a accname.
 		System.out.println("Enter your Name Please:: (_We will asign this as your account name)");
		try {
			accname1 = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
 		// Ask the user to enter a pwd.
 		System.out.println("Enter your Account Password Please:: (_We will asign this as your account pwd)");
 		
		try {
			pwd1 = in.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		// Ask the user to enter a pwd again.
 		System.out.println("Confirm the Account Password Again Please::");
 		
		try {
			pwd1 = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

 		System.out.println("");
 		System.out.println("-------------------------------------------------------------RDB-----");
 		System.out.println("");

 	    int check1 = 1;
 		
 	   if (accname1.length() == 0)
        {
 		  System.out.println("You can't keep it as space !");
 		  check1 = 2;
        }
       
 	   else {
 		   
 	   
		  for (int i = 0; i < m_Acconts.length; i++)
	        {
	            if (m_Acconts[i][0].equals(accname1))
	            {
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    System.out.println("");
	                    System.out.println("This name have already taken,-- Plese try with NIC or another part of name !");
	                    System.out.println("");
	                    System.out.println("-------------------------------------------------------------RDB-----");
	                    check1 = 2;
	                    
	                 if (m_Acconts[i][1].equals(pwd1))
	                 	{
	                	 	System.out.println("-------------------------------------------------------------RDB-----");
	                	 	System.out.println("");
	                	 	System.out.println("You are trying to override the existing account !, Security Error ! ");
	                	 	System.out.println("");
	                	 	System.out.println("-------------------------------------------------------------RDB-----");
	                	 	check1 = 2;
	                 	}
	            }
	        }  
		  
		  if(check1 == 1) {
	         
	        for (int j = 0; j < m_Acconts.length; j++)
	      	        {
	      	            if (m_Acconts[j][0].equals(""))
	      	            {
	      	                 if (m_Acconts[j][1].equals(""))
	      					{
	      	                	 m_Acconts[j][0] = accname1;
	      	                	 m_Acconts[j][1] = pwd1;
	      	                	 m_Acconts[j][1] = "";
	      	                	 return true;
	      					}
	      	            }
	      	        }
		  }
		  
 	   }
 	   
	        return false;
	}
		
	
	
	

	public boolean changepwd(String accno,String pwd) {
      	
        for (int i = 0; i < m_Acconts.length; i++)
        {
            if (m_Acconts[i][0].equals(accno))
            {
                 if (m_Acconts[i][1].equals(pwd))
				{
         	 		System.out.println("-------------------------------------------------------------RDB-----");
	    	 		System.out.println("");
	    	 		System.out.println("           -- CHANGE YOR ACCOUNT PASSWORD HERE "+accno+" --            ");
        	
	    	 		System.out.println("Enter your New Password Please:: (_We will asign this as your new account pwd)");
	    	 		System.out.println(":-");
	    	 		try {
						accnewpwd = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		System.out.println("Clarify your New Password Again Please::");
	    	 		System.out.println(":-");
	    	 		try {
						accnewpwd = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		m_Acconts[i][1] = accnewpwd;
	    	 		System.out.println("");
	    	 		System.out.println("-------------------------------------------------------------RDB-----");
	    	 		System.out.println("");
	    	
	    	 		return true;
				}
            }
        }
        return false;
    }



	
   public boolean changeaccname(String accno,String pwd) {
      	
        for (int i = 0; i < m_Acconts.length; i++)
        {
            if (m_Acconts[i][0].equals(accno))
            {
                 if (m_Acconts[i][1].equals(pwd))
				{
         	 		System.out.println("-------------------------------------------------------------RDB-----");
	    	 		System.out.println("");
	    	 		System.out.println("           -- CHANGE YOR ACCOUNT NAME HERE "+accno+" --            ");
        	
	    	 		int check2 = 1 ;
	    	 		
	    	 		System.out.println("Enter your New Name Please:: (_We will asign this as your new account name)");
	    	 		System.out.println(":-");
	    	 		try {
						accnewname = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		System.out.println("Clarify your New Name again Please::");
	    	 		System.out.println(":-");
	    	 		try {
	    	 			accnewname = in.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
	    	 		
	    	 		
	    	 		//Ensure name not existing
	    	 		
	    	 		  for (int j = 0; j < m_Acconts.length; j++)
	    	 	       {
	    	 	           if (m_Acconts[j][0].equals(accnewname))
	    	 	           {
	    	 	           	       System.out.println("-------------------------------------------------------------RDB-----");
	    	 	                   System.out.println("");
	    	 	                   System.out.println("This name have already taken,Please use another part of name or your NIC number !");
	    	 	                   System.out.println("Account Name didn't updated !");
	    	 	                   System.out.println("");
	    	 	                   System.out.println("-------------------------------------------------------------RDB-----");
	    	 	                   check2 = 2 ;
	    	 	           }
	    	 	       } 
	    	 		
	    	 		 if(check2 == 1) {
	    	 			 
	    	 			m_Acconts[i][0] = accnewname;
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

	
   
   
   
   public boolean updatebalance2(String accno,String balance) {
       
	   int i=0;
	   int p=0;
	   
	   for ( i = 0; i < m_Acconts.length; i++)
       {
           if (m_Acconts[i][0].equals(accno))
           {
        	    double V1 = Double.parseDouble(m_Acconts[i][2]);
  			    double V2 = Double.parseDouble(balance);
  			    double V3 = V1+V2;
  			    m_Acconts[i][2] = Double.toString(V3); 
                p=10;
        	   	System.out.println("-------------------------------------------------------------RDB-----");
        	   	System.out.println("");
   			   	System.out.println("Rs."+ balance + " Successfully Transfered from your account to "+accno+"'s account");
   			   	System.out.println("");
 
           }
           
       }
		
	   if (p==0)
       {
			System.out.println("");
	 		System.out.println("-------------------------------------------------------------RDB-----");
	 		System.out.println("");
	 		System.out.println("Sorry this transfered account is not in here more  ! ");
	 		System.out.println("*Pleas Contact Accontant to Request on this matter ! ");
	 		System.out.println("");
	 		return false;
       }
	   
       return true;
       
       
   }
   
   
   public double getTotal() {
	   
	   int i=0;
	   double tot = 0;
	   
	   for ( i = 0; i < m_Acconts.length; i++)
       {  
		   if(m_Acconts[i][2]=="") {
			   tot = tot;
		   }
		   else {
		   tot = tot + Double.parseDouble(m_Acconts[i][2]);
		   }
       }
	   
	   return tot;
   }

   
   public boolean getacclist() {
	   int i=0;
	   double tot = 0;	System.out.println("-------------------------------------------------------------RDB-----");
		System.out.println("");
		System.out.println("           -- FULL LIST OF CURRENTLY EXISTING BANK ACCOUNTS AT RDB --            ");
	   
	   for ( i = 0; i < m_Acconts.length; i++)
       {  
		   if(m_Acconts[i][0]=="") {
			   tot = tot;
		   }
		   else {
			   if(m_Acconts[i][2]=="") {
				   tot = tot;
			   }
			   else {
				System.out.println("");
		 		System.out.println("*** Account Name :-     "+m_Acconts[i][0]+" ,Account Balance :-   "+m_Acconts[i][2]);
			   
		        tot = tot + Double.parseDouble(m_Acconts[i][2]);
			   }
		   }
       }
	   
	    System.out.println("");
	    System.out.println("");
	    System.out.println("-------------------------------------------------------------RDB-----");
	 	System.out.println("");
	    System.out.println("");
		System.out.println("Full Money Amount Currently at RDB bank is :- "+tot);
		System.out.println("");
		System.out.println("-------------------------------------------------------------RDB-----");
   
	return true;
	   
   }
   
   
   
   
   
   
   
   public boolean increasetotal(String b) {
	   
	   double per =  Double.parseDouble(b);
	   double tot = 0;
	   double temp;
	   double temp2; 
	   double temp3; 
	   
	   for ( int i = 0; i < m_Acconts.length; i++)
       {  
		   if(m_Acconts[i][0]=="") {
			   tot = tot;
		   }
		   else {
			   
			   if(m_Acconts[i][1]=="") {
				   tot = tot;
			   }
			   else {
			   
				   if(m_Acconts[i][2]=="") {
					   tot = tot;
				   }
				   else {
					   temp = Double.parseDouble(m_Acconts[i][2]);
					   temp2 = ((temp)*per/100);
					   tot = tot + temp2;
					   temp3 = temp+temp2;
					   m_Acconts[i][2] = Double.toString(temp3); 
				   }
		   
			   		}
		        }
		   
       }
	    System.out.println("");
	    System.out.println("-------------------------------------------------------------RDB-----");
	    System.out.println("");
		System.out.println("Full Additional Money Amount you have to add to RDB Basic after Adding the Interest :- "+tot);
		 System.out.println("");
		System.out.println("-------------------------------------------------------------RDB-----");
   
	return true;
	   
   }
   
  
   
   
	public boolean deleteaccont(String deleteaccont) {
		
		System.out.println("--------------------------------------->>>>>>>>>>");
		
		
	     for (int i = 0; i < m_Acconts.length; i++)
	        {
	            if (m_Acconts[i][0].equals(deleteaccont))
	            {
	            	   m_Acconts[i][0]="";
					   m_Acconts[i][1]="";
					   m_Acconts[i][2]="";

			 			System.out.println("-------------------------------------------------------------RDB-----");
			 			System.out.println("");
   		    		    System.out.println("Successflly Deleted Account Name :- "+deleteaccont+" (Is No More)");
			 			System.out.println("");
			 			System.out.println("-------------------------------------------------------------RDB-----");
					   return true;
	            }
	        }
		
		 
		return false;
	}
}

	
	
	
