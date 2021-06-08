package servicepublisher;

public interface ServicePublish {
	
	public String publishService();
	
	public boolean checkpwd(String accno,String pwd);
	
	public boolean CreateAccount();

	public boolean changeaccname(String accno,String pwd);
	
	public boolean changepwd(String accno,String pwd);
	
	public String getbalance(String accno,String pwd);
	
	public double getTotal();
	
	public boolean updatebalance(String accno,String pwd,String balance);
	
	public boolean updatebalance2(String accno,String balance);

	public boolean getacclist();

	public boolean increasetotal(String b);

	public boolean deleteaccont(String deleteaccont);
	
}
