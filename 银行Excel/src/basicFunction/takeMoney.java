package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.ShuRu;

public class takeMoney {
	
	////////////取钱的方法
	public takeMoney() {

		System.out.println("请输入您要取的钱数：");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		if (a>login.card.getMoney()) {
			System.out.println("余额不足。操作失败。");
		}
		else login.card.setMoney(login.card.getMoney()-a) ;
		System.out.println("您已取走"+a+"元,现在卡里的余额是："+(login.card.getMoney()));

	}
	

}
