package payment;

import java.util.HashMap;

public class Cheque extends Payment implements Authorization{
	private String name;
	private String bankID;
	HashMap<String,String> map=new HashMap<String,String>();
	   public Cheque()
	   {  map.put("PNB", "PNBN0321123");
	   map.put("CITIBANK", "CITI0123456");
	   map.put("YES", "YESN0123456");
	   map.put("ICICI", "ICIC0123456");
	   
		   }
	   
	   
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankID() {
		return bankID;
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	public boolean authorized() {
		// TODO Auto-generated method stub
		
		if(bankID.equals(map.get("name")))
				{
			       return true;
				}
		return false;
	}
	

}
