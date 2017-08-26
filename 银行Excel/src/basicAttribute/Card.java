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
		return "����Ϣ�� ����=" + cartnumber + ", " +keynumber+ person ;
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
	////////////ȡǮ�ķ���
	public void takeMoney() {
		System.out.println("��������Ҫȡ��Ǯ����");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		if (a>money) {
			System.out.println("���㡣����ʧ�ܡ�");
		}
		else this.money = money-a;
		System.out.println("����ȡ��"+a+"Ԫ,���ڿ��������ǣ�"+(this.money));
	}
	/////////////������Ļ��˷���
	public void takeMoney2(double a) {
		 this.money = money-a;
	}
	
	
	////////////ת�˵ķ���
	public void moveMoney() {
		System.out.println("��������Ҫת��Ǯ����");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		System.out.println("��������Ҫת�Ŀ��ţ�");
		int b = scanner.nextInt();
		
		Card cart=login.getById(b);
		if (cart==null) {
			System.out.println("��Ҫת�˵Ŀ������ڡ�");
		}
		else {
		if (a>money) {
			System.out.println("���㡣����ʧ�ܡ�");
		}
		else {
			this.money = money-a;
			System.out.println("���ѳɹ�ת��"+a+"Ԫ,���ڿ��������ǣ�"+(this.money));
			//////��ת�˵Ŀ����Ǯ
			cart.setMoney(a);
			}
		}
		
		
	}
	
}