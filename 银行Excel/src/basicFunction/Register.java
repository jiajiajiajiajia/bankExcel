package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;
import basicAttribute.Person;
import basicAttribute.ShuRu;

public class Register {
	////////////////ע��ķ���
	public static void zhuce () {
		System.out.println("���������ĸ�����Ϣ��"+"\n");
		System.out.println("���õȼ���");
		Scanner scanner = ShuRu.getInstance();
		int creditRating = scanner.nextInt();
		System.out.println("name��");
		String name = scanner.next();
		System.out.println("age��");
		int age = scanner.nextInt();
		Person p1 = new Person(creditRating, name, age);
		System.out.println("���ţ�");
		int card = scanner.nextInt();
		System.out.println("���룺");
		String key = scanner.next();
		Card c1=new Card(card,key,p1,0);
		Card.cards.add(c1);
		
		
	}

}
