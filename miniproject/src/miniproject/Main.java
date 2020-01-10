package miniproject;

	import java.util.*;

	public class Main {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int c = 0;
			int age=0;
			int opt;
			double amount=0;
			
			do {
				System.out.println("1. Interest Calculator For SB Account : ");
				System.out.println("2. Interest Calculator For FD Account : ");
				System.out.println("3. Interest Calculator For RD Account : ");
				System.out.println("Enter your option (Between 1 to 4): ");
				
				c  = sc.nextInt();
				
				
				switch (c) {
				case 1:
					SBAccount sb = new SBAccount();
					System.out.print("\nEnter the account type [Normal / NRI] : ");
					String s=sc.next();
					s=sc.nextLine();
					sb.setaccType(s);
					System.out.print("\nEnter the Average amount in your account: ");
					amount=sc.nextDouble();
					try{
						if(amount < 0)
						{
							throw new NegativeValueException();
						}
						else
						{
							sb.setAmount(amount);
							System.out.println("Interest gained: Rs. " + sb.calculateInterest());
						}
					}
					catch(NegativeValueException e)
					{
						System.out.println(e);
					}
					
					break;
					
				case 2:
					FDAccount fd = new FDAccount();
					System.out.print("\nEnter the FD ammount: ");
					 amount=sc.nextDouble();
					try{
						if(amount<0)
						{
							throw new NegativeValueException();
						}
						else
						{
							fd.setAmount(amount);
							System.out.print("\nEnter number of days: ");
							int noOfDays = sc.nextInt();
							try{
								if(noOfDays < 0)
								{
									throw new NegativeValueException();
								}
								else
								{
									fd.setNoOfDays(noOfDays);
									System.out.print("\nEnter your age: ");
									age = sc.nextInt();
									try{
										if(age < 0)
										{
											throw new NegativeValueException();
										}
										else
										{
											fd.setAgeOfACHolder(age);
											
											System.out.println("Interest gained: Rs. " + fd.calculateInterest());
										}
									}
									catch(NegativeValueException e)
									{
										System.out.println(e);
									}
								}
							}
							catch(NegativeValueException e)
							{
								System.out.println(e);
							}	
						}
					}
					catch(NegativeValueException e)
					{
						System.out.println(e);
					}
					
					break;
					
				case 3:
					RDAccount rd = new RDAccount();
					System.out.print("\nEnter the RD ammount: ");
					amount=sc.nextDouble();
					try
					{
						if(amount < 0)
						{
							throw new NegativeValueException();
						}
						else
						{
							rd.setAmount(amount);
							System.out.print("\nEnter number of months: ");
							int noOfMonths = sc.nextInt();
							try
							{
								if(noOfMonths < 0)
								{
									throw new NegativeValueException();
								}
								else
								{
									rd.setNoOfMonth(noOfMonths);
									System.out.print("\nEnter your age: ");
									age = sc.nextInt();
									try
									{
									  if(age < 0)
									  {
										  throw new NegativeValueException();
									  }
									  else
									  {
										  rd.setAgeOfACHolder(age);
										  System.out.println("Interest gained: Rs. " + rd.calculateInterest());
									  }
									}
									catch(NegativeValueException e)
									{
										System.out.println(e);
									}
								}
							}
							catch(NegativeValueException e)
							{
								System.out.println(e);
							}	
						}
					}
					catch(NegativeValueException e)
					{
						System.out.println(e);
					}	
					
					break;
					
				case 4:
					System.out.println("Out of the loop");
					break;
					
				default:
					System.out.println("Enter the valid option");
				}
				
				System.out.println("\n Do you want to cntinue [1/0].....???? : ");
				
				 opt=sc.nextInt();	
			
			} while (opt ==1);
			
			sc.close();
		}

	}

