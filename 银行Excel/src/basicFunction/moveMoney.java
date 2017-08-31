package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.ShuRu;

public class moveMoney {
	public moveMoney() {
		////////////转账的方法
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
		if (a>login.card.getMoney()) {
			System.out.println("余额不足。操作失败。");
		}
		else {
			login.card.setMoney(login.card.getMoney()-a);
			System.out.println("您已成功转账"+a+"元,现在卡里的余额是："+(login.card.getMoney()));
			//////被转账的卡里加钱
			cart.setMoney(a);
			}
		}
			
	
	}

}
