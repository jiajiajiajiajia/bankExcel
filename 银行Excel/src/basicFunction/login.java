package basicFunction;

import java.util.Scanner;

import basicAttribute.Card;


public class login {
	
	
	public static Card card;
	
	
	
	
    ///////////////��֤�˺�����ķ�����
	public static int count;
	@SuppressWarnings("resource")
	public static boolean chack() {

		outer:
		for (int i=0;i<3;i++) {
			System.out.println("-------------��ӭ��¼------------");
			System.out.println("�������˺ţ�");
			Scanner scanner=new Scanner(System.in);
			int a = scanner.nextInt();
			System.out.println("���������룺");
			String b = scanner.next();	
			int x = (int)(Math.random()*(9999-1000+1))+1000;
			System.out.println(x);
			System.out.println("����������������֤�룺");
			int c = scanner.nextInt();
			for (int i1=0;i1<Card.cards.size();i1++) {
				if(Card.cards.get(i1).getCartnumber()==a && Card.cards.get(i1).getKeynumber().equals(b)&&c==x) {
					
					card=Card.cards.get(i1);
					System.out.println("��֤�ɹ������������ҵ�������");
					count+=1;
					break outer;
				}
				
			}
			if(i<2  ){
					System.out.println("����������������롣");
				}
				if(i==2){
					System.out.println("�������,����������������ˣ������ٰ����κ�ҵ��");
					System.exit(0);
				}
			}
		if (count==1)return true;
		else return false;
		
	}
	//////////////����id�������п��ķ���
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
