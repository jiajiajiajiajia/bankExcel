package loan;

import java.io.IOException;
import java.text.NumberFormat;

import basicAttribute.Card;
import basicFunction.login;
import face.Do;
import jxl.read.biff.BiffException;

public class repay /*extends LoanAttribute*/{
	
	
	/////////////还款的方法
	public repay (Card c1) throws IOException, BiffException {
		
		login.card.getPerson().getMyLoan().剩余还款数=login.card.getPerson().getMyLoan().剩余还款数-login.card.getPerson().getMyLoan().money*login.card.getPerson().getMyLoan().rate/(login.card.getPerson().getMyLoan().year*12);
		login.card.getPerson().getMyLoan().月还款额=login.card.getPerson().getMyLoan().money/(12*login.card.getPerson().getMyLoan().year)+(login.card.getPerson().getMyLoan().剩余还款数)*login.card.getPerson().getMyLoan().rate/12;
		if (c1.getMoney()<login.card.getPerson().getMyLoan().月还款额) {
			System.out.println("余额不足。请换张卡支付或者存一些钱。");
			Do.doSomeThing();
		}else {
			c1.takeMoney2(login.card.getPerson().getMyLoan().月还款额);
			NumberFormat ins = NumberFormat.getCurrencyInstance();
			ins.setMaximumFractionDigits(3);
			String INS=ins.format(login.card.getPerson().getMyLoan().月还款额);
			String INS2=ins.format(login.card.getPerson().getMyLoan().剩余还款数);
			String INS3=ins.format(c1.getMoney());
			
			System.out.println("本次还款后:"+"\n"+"剩余还款额为："+INS2+"  以后每月需要还："+INS+"  您的卡里余额为："+INS3);
		}
		
		
	}

}
