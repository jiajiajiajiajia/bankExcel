package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.ShuRu;

public class takeMoney {
	
	////////////ȡǮ�ķ���
	public takeMoney() {

		System.out.println("��������Ҫȡ��Ǯ����");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		if (a>login.card.getMoney()) {
			System.out.println("���㡣����ʧ�ܡ�");
		}
		else login.card.setMoney(login.card.getMoney()-a) ;
		System.out.println("����ȡ��"+a+"Ԫ,���ڿ��������ǣ�"+(login.card.getMoney()));

	}
	

}
