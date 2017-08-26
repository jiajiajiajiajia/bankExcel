package basicAttribute;

import loan.Loan;

public class Person {
	private int creditRating;
	private String name;
	private int age;
	private  Loan myLoan;
	
	@Override
	public String toString() {
		return "户主信用等级=" + creditRating + ", 户主姓名=" + name + ", 户主年龄=" + age ;
	}

	public int getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Person(int creditRating, String name, int age) {
		super();
		this.creditRating = creditRating;
		this.name = name;
		this.age = age;
	}

	public Loan getMyLoan() {
		return myLoan;
	}

	public  void setMyLoan(Loan myLoan) {
		this.myLoan = myLoan;
	}

	
	

}
