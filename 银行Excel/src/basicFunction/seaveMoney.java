package basicFunction;

import java.util.Scanner;

import basicAttribute.ShuRu;
//////��Ǯ
public class seaveMoney {
	
	public seaveMoney() {
		System.out.println("��������Ҫ���Ǯ����");
		Scanner scanner = ShuRu.getInstance();
		int a = scanner.nextInt();
		login.card.setMoney(login.card.getMoney()+a) ;
		System.out.println("��Ǯ�ɹ���");
	
	}

}
