/***********************
 *
 *   PiggyBank is the constructor and getter/setters for piggy banks
 *
 *   Author:   Corey Caldwell
 *   Date:     2016-Mar 28
 *
 ***********************/
 public class PiggyBank
 {
	private String name;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	 
	public PiggyBank(String _name){
		this.name = _name;
		this.quarters = 0;
		this.dimes = 0;
		this.nickels = 0;
		this.pennies = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addQuarter(){
		this.quarters++;
	}
	
	public int getQuarterCnt(){
		return this.quarters;
	}
	
	public void addDime(){
		this.dimes++;
	}
	
	public int getDimeCnt(){
		return this.dimes;
	}
	
	public void addNickel(){
		this.nickels++;
	}
	
	public int getNickelCnt(){
		return this.nickels;
	}
	
	public void addPenny(){
		this.pennies++;
	}
	
	public int getPennyCnt(){
		return this.pennies;
	}
	
	public double contains(){
		double totalAmount = 0.0;
		totalAmount = (this.quarters * 0.25) + (this.dimes * 0.1) + (this.nickels * 0.05) + (this.pennies * 0.01);
		return totalAmount;
	}
	
	public double empty(){
		double totalAmount = 0.0;
		totalAmount = (this.quarters * 0.25) + (this.dimes * 0.1) + (this.nickels * 0.05) + (this.pennies * 0.01);
		this.quarters = 0;
		this.dimes = 0;
		this.nickels = 0;
		this.pennies = 0;
		return totalAmount;
	}
	
	public String toString(){
		String result = "Piggy Bank Name: " + this.name + "\nNumber of quarters: " + this.quarters 
		+ "\nNumber of dimes: " + this.dimes + "\nNumber of nickels: " + this.nickels + "\nNumber of Pennies: "
		+ this.pennies;
		return result;
	}
 }
