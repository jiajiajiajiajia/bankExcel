package loan;

import java.io.IOException;
import java.text.NumberFormat;

import basicAttribute.Card;
import basicFunction.login;
import face.Do;
import jxl.read.biff.BiffException;

public class repay /*extends LoanAttribute*/{
	
	
	/////////////����ķ���
	public repay (Card c1) throws IOException, BiffException {
		
		login.card.getPerson().getMyLoan().ʣ�໹����=login.card.getPerson().getMyLoan().ʣ�໹����-login.card.getPerson().getMyLoan().money*login.card.getPerson().getMyLoan().rate/(login.card.getPerson().getMyLoan().year*12);
		login.card.getPerson().getMyLoan().�»����=login.card.getPerson().getMyLoan().money/(12*login.card.getPerson().getMyLoan().year)+(login.card.getPerson().getMyLoan().ʣ�໹����)*login.card.getPerson().getMyLoan().rate/12;
		if (c1.getMoney()<login.card.getPerson().getMyLoan().�»����) {
			System.out.println("���㡣�뻻�ſ�֧�����ߴ�һЩǮ��");
			Do.doSomeThing();
		}else {
			c1.takeMoney2(login.card.getPerson().getMyLoan().�»����);
			NumberFormat ins = NumberFormat.getCurrencyInstance();
			ins.setMaximumFractionDigits(3);
			String INS=ins.format(login.card.getPerson().getMyLoan().�»����);
			String INS2=ins.format(login.card.getPerson().getMyLoan().ʣ�໹����);
			String INS3=ins.format(c1.getMoney());
			
			System.out.println("���λ����:"+"\n"+"ʣ�໹���Ϊ��"+INS2+"  �Ժ�ÿ����Ҫ����"+INS+"  ���Ŀ������Ϊ��"+INS3);
		}
		
		
	}

}
