package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.ShuRu;

public class moveMoney {
	public moveMoney() {
		////////////ת�˵ķ���
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
		if (a>login.card.getMoney()) {
			System.out.println("���㡣����ʧ�ܡ�");
		}
		else {
			login.card.setMoney(login.card.getMoney()-a);
			System.out.println("���ѳɹ�ת��"+a+"Ԫ,���ڿ��������ǣ�"+(login.card.getMoney()));
			//////��ת�˵Ŀ����Ǯ
			cart.setMoney(a);
			}
		}
			
	
	}

}
