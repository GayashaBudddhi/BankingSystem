package customermoneyservicepublisher;

public interface MonyServicePublish {
	
	public String publishService();
	
	public boolean chechaccBalance(String balance);
	
	public String DepositMoney(String balance);
	
	public String WithdrowMoney(String balance);
	
	public boolean showTotal(double balance);
	
	public String Transaction(String balance);

	public String updamt();

	public String deleteaccont();
	
}
