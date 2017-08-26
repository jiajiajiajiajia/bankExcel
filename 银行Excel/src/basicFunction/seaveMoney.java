package basicFunction;

import java.util.Scanner;

import basicAttribute.ShuRu;
//////存钱
public class seaveMoney {
	
	public seaveMoney() {
		System.out.println("请输入您要存的钱数：");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		login.card.setMoney(login.card.getMoney()+a) ;
		System.out.println("存钱成功。");
	
	}

}
