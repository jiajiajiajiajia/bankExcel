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
	////////////取钱的方法
	public void takeMoney() {
		System.out.println("请输入您要取的钱数：");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		if (a>money) {
			System.out.println("余额不足。操作失败。");
		}
		else this.money = money-a;
		System.out.println("您已取走"+a+"元,现在卡里的余额是："+(this.money));
	}
	/////////////还贷款的划账方法
	public void takeMoney2(double a) {
		 this.money = money-a;
	}
	
	
	////////////转账的方法
	public void moveMoney() {
		System.out.println("请输入您要转的钱数：");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		System.out.println("请输入您要转的卡号：");
		int b = scanner.nextInt();
		
		Card cart=login.getById(b);
		if (cart==null) {
			System.out.println("您要转账的卡不存在。");
		}
		else {
		if (a>money) {
			System.out.println("余额不足。操作失败。");
		}
		else {
			this.money = money-a;
			System.out.println("您已成功转账"+a+"元,现在卡里的余额是："+(this.money));
			//////被转账的卡里加钱
			cart.setMoney(a);
			}
		}
		
		
	}
	
}