package face;

import java.io.IOException;
import java.util.Scanner;

import IO��.Write;
import basicAttribute.ShuRu;
import basicFunction.login;
import basicFunction.seaveMoney;
import jxl.read.biff.BiffException;
import loan.Judge;
import loan.Loan;
import loan.repay;

public class Do {
	public static void doSomeThing() throws IOException, BiffException {
		System.out.println("��������Ҫѡ��Ĺ��ܣ�"+"\n"+"1�����"+"2��ȡ��"+"3��ת��"+"4����ѯ���"+"5������"+"6������"+"7��������һ��"+"8���˳�ϵͳ");
		Scanner scanner = ShuRu.getInstance();
		int s2 = scanner.nextInt();
		switch (s2) {
		case 1:new seaveMoney();
			System.out.println("������һ���밴1���˳������밴2��");
			int j = scanner.nextInt();
			if (j==1) {
			doSomeThing();}
			else if(j==2) {
				Write.write();
				System.exit(0);				
			}
			break;
		case 2:login.card.takeMoney();
			System.out.println("������һ���밴1���˳������밴2��");
			int j1 = scanner.nextInt();
			if (j1==1) {
				doSomeThing();}
			else if(j1==2) {
				Write.write();
				System.exit(0);				
			}
			break;
		case 3:login.card.moveMoney();
			System.out.println("������һ���밴1���˳������밴2��");
			int j2 = scanner.nextInt();
			if (j2==1) {
				doSomeThing();}
			else if(j2==2) {
				Write.write();
				System.exit(0);
			}
			break;
		case 5:new Judge();
			System.out.println("������һ���밴1���˳������밴2��");
			int j3 = scanner.nextInt();
			if (j3==1) {
				doSomeThing();}
			else if(j3==2) {
				Write.write();
				System.exit(0);
			}
			break;
		case 6:new repay(login.card);
			System.out.println("������һ���밴1���˳������밴2��");
			int j4 = scanner.nextInt();
			if (j4==1) {
				doSomeThing();}

			else if(j4==2) {
				Write.write();
				System.exit(0);
			}
			break;
		case 7:
			Face.frist();doSomeThing();
			break;
		case 8:
			Write.write();
			System.exit(0);
			break;
		case 4:System.out.println(login.card.getMoney());
			System.out.println("������һ���밴1���˳������밴2��");
			int j5 = scanner.nextInt();
			if (j5==1) {
				doSomeThing();}

			else if(j5==2) {
				Write.write();
				System.exit(0);	
			}
			break;
		default:
			break;
		}
	}
	
	
	


}
