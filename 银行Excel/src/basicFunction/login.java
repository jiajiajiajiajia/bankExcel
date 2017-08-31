package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;


public class login {
	
	
	public static Card card;
	
	
	
	
    ///////////////验证账号密码的方法。
	public static int count;
	@SuppressWarnings("resource")
	public static boolean chack() {

		outer:
		for (int i=0;i<3;i++) {
			System.out.println("-------------欢迎登录------------");
			System.out.println("请输入账号：");
			Scanner scanner=new Scanner(System.in);
			int a = scanner.nextInt();
			System.out.println("请输入密码：");
			String b = scanner.next();	
			int x = (int)(Math.random()*(9999-1000+1))+1000;
			System.out.println(x);
			System.out.println("请输入您看到的验证码：");
			int c = scanner.nextInt();
			for (int i1=0;i1<Card.cards.size();i1++) {
				if(Card.cards.get(i1).getCartnumber()==a && Card.cards.get(i1).getKeynumber().equals(b)&&c==x) {
					
					card=Card.cards.get(i1);
					System.out.println("验证成功，请进行所需业务操作。");
					count+=1;
					break outer;
				}
				
			}
			if(i<2  ){
					System.out.println("输入错误，请重新输入。");
				}
				if(i==2){
					System.out.println("输入错误,您今天输错了三次了，不能再办理任何业务。");
					System.exit(0);
				}
			}
		if (count==1)return true;
		else return false;
		
	}
	//////////////根据id查找银行卡的方法
	public static Card getById(int id)
	{
		for(int i=0;i<Card.cards.size();i++)
		{
			if(Card.cards.get(i).getCartnumber()==id)
				return Card.cards.get(i);
		}
		return null;
	}


}
