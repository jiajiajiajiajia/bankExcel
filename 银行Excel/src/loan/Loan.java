package loan;

import java.text.NumberFormat;
import java.util.Scanner;

import basicAttribute.Person;
import basicAttribute.ShuRu;

public class Loan extends LoanAttribute{

	public  Loan (String name, int money,int year,double rate,double ʣ�໹����) {
		super(name, money, year, rate, ʣ�໹����);
	}
	
	/////////////ͨ�����캯������������
	public  Loan (Person person) {
		
		//�������õȼ����������������޺�����
		if (person.getCreditRating()==1) {
			maxMoney=4000000;
			Scanner scanner = ShuRu.getInstance();
			System.out.println("��������Ҫ����Ľ�");
			int a = scanner.nextInt();
			System.out.println("��������Ҫ��������ޣ�");
			int b = scanner.nextInt();
			money=a;
			year=b;
			if(a>maxMoney) {
				System.out.println("�������õȼ���������"+a+"Ԫ��");
				new Loan(person);
			}else if(a<20) {
				this.rate=0.0380;
				
			}else if(a>20) {
				this.rate=0.0375;
			}
		}
		if (person.getCreditRating()==2) {
			this.maxMoney=3000000;
			Scanner scanner = ShuRu.getInstance();
			System.out.println("��������Ҫ����Ľ�");
			int a = scanner.nextInt();
			System.out.println("��������Ҫ��������ޣ�");
			int b = scanner.nextInt();
			money=a;
			year=b;
			if(a>maxMoney) {
				System.out.println("�������õȼ���������"+a+"Ԫ��");
				new Loan(person);
			}else if(a<10) {
				this.rate=0.0390;
			}else if(a>10) {
				this.rate=0.0380;
			}
		}
		//ÿ���¹���=(�����»�������)+(�����-�ѹ黹�����ۼƶ�)��������(�ȶϢ���)
		this.�»����=money/(12*year)+(money)*rate/12;
		this.ʣ�໹����=money;
		NumberFormat ins = NumberFormat.getCurrencyInstance();
		ins.setMaximumFractionDigits(3);
		String INS=ins.format(�»����);
		//String rate2 = NumberFormat.getPercentInstance().format(rate);
		
		System.out.println("��Ҫ����"+money+"�򣬴���"+year+"�꣬��������Ϊ��"+rate+",ÿ�»����Ϊ��"+INS);
		
	}
	
//	public  void huankuan(Card c1) throws BiffException, IOException {
//	
//		this.ʣ�໹����=ʣ�໹����-money*rate/(year*12);
//		this.�»����=money/(12*year)+(ʣ�໹����)*rate/12;
//		if (c1.getMoney()<�»����) {
//			System.out.println("���㡣�뻻�ſ�֧�����ߴ�һЩǮ��");
//			Do.doSomeThing();
//		}else {
//			c1.takeMoney2(�»����);
//			NumberFormat ins = NumberFormat.getCurrencyInstance();
//			ins.setMaximumFractionDigits(3);
//			String INS=ins.format(�»����);
//			String INS2=ins.format(ʣ�໹����);
//			String INS3=ins.format(c1.getMoney());
//		
//			System.out.println("���λ����:"+"\n"+"ʣ�໹���Ϊ��"+INS2+"  �Ժ�ÿ����Ҫ����"+INS+"  ���Ŀ������Ϊ��"+INS3);
//		}
//	
//	
//	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double a) {
		this.rate=a;
		
	}

	public Person getPerson() {
		return person;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double get�»����() {
		return �»����;
	}
	public void set�»����(double �»����) {
		this.�»���� = �»����;
	}
	public double getʣ�໹����() {
		return ʣ�໹����;
	}
	public void setʣ�໹����(double ʣ�໹����) {
		this.ʣ�໹���� = ʣ�໹����;
	}
//	@Override
//	public String toString() {
//		return "Loan [ money=" + money + ", year=" + year + ", rate=" + rate + ", �»����=" + �»����
//				+ ", ʣ�໹����=" + ʣ�໹���� + "]";
//	}
	
	
}
