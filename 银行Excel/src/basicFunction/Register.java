package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.Person;
import basicAttribute.ShuRu;

public class Register {
	////////////////注册的方法
	public static void zhuce () {
		System.out.println("请输入您的个人信息："+"\n");
		System.out.println("信用等级：");
		Scanner scanner = ShuRu.getInstance();
		int creditRating = scanner.nextInt();
		System.out.println("name：");
		String name = scanner.next();
		System.out.println("age：");
		int age = scanner.nextInt();
		Person p1 = new Person(creditRating, name, age);
		System.out.println("卡号：");
		int card = scanner.nextInt();
		System.out.println("密码：");
		String key = scanner.next();
		Card c1=new Card(card,key,p1,0);
		Card.cards.add(c1);
		
		
	}

}
