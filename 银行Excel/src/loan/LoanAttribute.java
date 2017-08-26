package loan;

import basicAttribute.Person;

public abstract class  LoanAttribute {
	
	protected Person person;
	protected int money;
	protected int maxMoney;
	protected int year;
	protected double rate;
	
	protected double 月还款额;
	protected double 剩余还款数;
	public LoanAttribute(String name, int money,int year,double rate,double 剩余还款数) {
		this.person.setName(name);
		this.money=money;
		this.year=year;
		this.剩余还款数=剩余还款数;
		this.rate=rate;
		
	}
	public LoanAttribute() {
		
		
	}

}
