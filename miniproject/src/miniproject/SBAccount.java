package miniproject;


public class SBAccount extends Abstract{
	
	double interestRate;
	double amount;
	String accountType;
	
	public double calculateInterest()
	{
		if (getaccType().equals("normal")) 
		{
			setInterestRate(4);
		}
		else 
		{
			setInterestRate(6);
		}
		
		double interest = getAmount() * getInterestRate() / 100.0;
		
		return interest;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public String getaccType() {
		return accountType;
	}

	public void setaccType(String accountType) {
		this.accountType = accountType;
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}





}
