package face;

import java.io.IOException;
import java.util.Scanner;

import IO流.Read;
import IO流.Write;
import basicAttribute.Card;
import basicAttribute.ShuRu;
import basicFunction.Register;
import basicFunction.login;
import jxl.read.biff.BiffException;

public class Face {
	////这里就不用再初始化卡了，直接从文件里读取，然后赋值给carts即可。最后的时候（也就是在每句System.exit(0)之前），调用IO中的方法将新的cares中的结果写入文件即可。
	/////////先给初始化一个卡先。
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
		System.out.println("---------欢迎使用--------------");
		System.out.println("请输入您要选择的功能："+"\n"+"1、登录"+"2、注册"+"3、退出该系统");
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
