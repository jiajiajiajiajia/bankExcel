package face;

import java.io.IOException;
import java.util.Scanner;

import IO��.Read;
import IO��.Write;
import basicAttribute.Card;
import basicAttribute.ShuRu;
import basicFunction.Register;
import basicFunction.login;
import jxl.read.biff.BiffException;

public class Face {
	////����Ͳ����ٳ�ʼ�����ˣ�ֱ�Ӵ��ļ����ȡ��Ȼ��ֵ��carts���ɡ�����ʱ��Ҳ������ÿ��System.exit(0)֮ǰ��������IO�еķ������µ�cares�еĽ��д���ļ����ɡ�
	/////////�ȸ���ʼ��һ�����ȡ�
//	{
//			Person p1=new Person(1, "Tom", 24);
//			Card c1=new Card(12345,"a12345", p1,0);
//			Card c2=new Card(23456,"a12345", p1,0);
//			Card.cards.add(c1);
//			Card.cards.add(c2);
//			System.out.println(Card.cards);
//		}

	
	public static void frist() throws IOException, BiffException {
		{
			Read.read();
		}
		System.out.println("---------��ӭʹ��--------------");
		System.out.println("��������Ҫѡ��Ĺ��ܣ�"+"\n"+"1����¼"+"2��ע��"+"3���˳���ϵͳ");
		//Scanner scanner=new Scanner(System.in);
		Scanner scan = ShuRu.getInstance();
		int s = scan.nextInt();
		switch (s) {
		case 1:if (login.chack()==true) {Do.doSomeThing();}break;
		case 2:Register.zhuce();
			login.chack(); 
			Do.doSomeThing();break;
		case 3:
			Write.write();
			System.exit(0);

		default:
			break;
		}
	}
}
