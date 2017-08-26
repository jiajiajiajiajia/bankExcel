package loan;

import java.text.NumberFormat;
import java.util.Scanner;

import basicAttribute.Person;
import basicAttribute.ShuRu;

public class Loan extends LoanAttribute{

	public  Loan (String name, int money,int year,double rate,double 剩余还款数) {
		super(name, money, year, rate, 剩余还款数);
	}
	
	/////////////通过构造函数来构造贷款订单
	public  Loan (Person person) {
		
		//根据信用等级来给定最大贷款年限和利率
		if (person.getCreditRating()==1) {
			maxMoney=4000000;
			Scanner scanner = ShuRu.getInstance();
			System.out.println("请输入您要贷款的金额：");
			int a = scanner.nextInt();
			System.out.println("请输入您要贷款的年限：");
			int b = scanner.nextInt();
			money=a;
			year=b;
			if(a>maxMoney) {
				System.out.println("您的信用等级不够贷款"+a+"元。");
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
			System.out.println("请输入您要贷款的金额：");
			int a = scanner.nextInt();
			System.out.println("请输入您要贷款的年限：");
			int b = scanner.nextInt();
			money=a;
			year=b;
			if(a>maxMoney) {
				System.out.println("您的信用等级不够贷款"+a+"元。");
				new Loan(person);
			}else if(a<10) {
				this.rate=0.0390;
			}else if(a>10) {
				this.rate=0.0380;
			}
		}
		//每月月供额=(贷款本金÷还款月数)+(贷款本金-已归还本金累计额)×月利率(等额本息还款法)
		this.月还款额=money/(12*year)+(money)*rate/12;
		this.剩余还款数=money;
		NumberFormat ins = NumberFormat.getCurrencyInstance();
		ins.setMaximumFractionDigits(3);
		String INS=ins.format(月还款额);
		//String rate2 = NumberFormat.getPercentInstance().format(rate);
		
		System.out.println("您要贷款"+money+"万，贷款"+year+"年，贷款利率为："+rate+",每月还款额为："+INS);
		
	}
	
//	public  void huankuan(Card c1) throws BiffException, IOException {
//	
//		this.剩余还款数=剩余还款数-money*rate/(year*12);
//		this.月还款额=money/(12*year)+(剩余还款数)*rate/12;
//		if (c1.getMoney()<月还款额) {
//			System.out.println("余额不足。请换张卡支付或者存一些钱。");
//			Do.doSomeThing();
//		}else {
//			c1.takeMoney2(月还款额);
//			NumberFormat ins = NumberFormat.getCurrencyInstance();
//			ins.setMaximumFractionDigits(3);
//			String INS=ins.format(月还款额);
//			String INS2=ins.format(剩余还款数);
//			String INS3=ins.format(c1.getMoney());
//		
//			System.out.println("本次还款后:"+"\n"+"剩余还款额为："+INS2+"  以后每月需要还："+INS+"  您的卡里余额为："+INS3);
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
	public double get月还款额() {
		return 月还款额;
	}
	public void set月还款额(double 月还款额) {
		this.月还款额 = 月还款额;
	}
	public double get剩余还款数() {
		return 剩余还款数;
	}
	public void set剩余还款数(double 剩余还款数) {
		this.剩余还款数 = 剩余还款数;
	}
//	@Override
//	public String toString() {
//		return "Loan [ money=" + money + ", year=" + year + ", rate=" + rate + ", 月还款额=" + 月还款额
//				+ ", 剩余还款数=" + 剩余还款数 + "]";
//	}
	
	
}
