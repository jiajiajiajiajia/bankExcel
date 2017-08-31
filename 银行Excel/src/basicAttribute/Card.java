package basicAttribute;

import java.util.ArrayList;
import java.util.Scanner;

import basicFunction.login;

public class Card {
	public void setCartnumber(int cartnumber) {
		this.cartnumber = cartnumber;
	}
	public void setKeynumber(String keynumber) {
		this.keynumber = keynumber;
	}


	protected int cartnumber;
	private String keynumber;
	private double money;
	private Person person;
	public static ArrayList <Card> cards=new ArrayList<Card>();
	


	public Card() {
		
	}
	public Card(int cartnumber, String keynumber,Person person,double money) {
		this.cartnumber = cartnumber;
		this.keynumber = keynumber;
		this.person=person;
		this.money=money;
	}
	
	

	@Override
	public String toString() {
		return "卡信息： 卡号=" + cartnumber + ", " +keynumber+ person ;
	}



	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public  int getCartnumber() {
		return cartnumber;
	}
	
	public  String getKeynumber() {
		return keynumber;
	}
	
	public void modifyKeynumber(String keynumber) {
		this.keynumber = keynumber;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double d) {
		this.money = money+d;
	}
	
	/////////////还贷款的划账方法
	public void takeMoney2(double a) {
		 this.money = money-a;
	}
	
	

	
}