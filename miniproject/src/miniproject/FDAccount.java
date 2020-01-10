package miniproject;


public class FDAccount extends Abstract{
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	
	public  double calculateInterest()
	{

		double interest= 0;
		
		if (amount < 10000000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
				interestRate = 4.5;
			} else if (noOfDays > 15 && noOfDays <= 29) {
				interestRate = 4.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				interestRate = 5.5;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				interestRate = 7;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				interestRate = 7.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				interestRate = 8;
			}
			
		if (ageOfACHolder >= 65) 
			interestRate += 0.5;
		} 
		else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				interestRate = 6.5;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				interestRate = 6.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				interestRate = 6.75;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				interestRate = 8;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				interestRate = 8.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				interestRate = 10;
			}
		}
		
		interest = amount * interestRate / 100;
		
		return interest;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	}

