package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import basicAttribute.Card;
import basicAttribute.Person;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read {

	
	@SuppressWarnings("unused")
	public static void read() throws IOException, BiffException{
	
		File file =new File("F:/IO.xls");
		InputStream in = new FileInputStream(file.getAbsolutePath());
		Workbook wb = Workbook.getWorkbook(in);
		Sheet sheet = wb.getSheet(0);
		for (int i=0;i<sheet.getRows();i++) {
			for (int j = 0;j<sheet.getColumns();j++) {
				//get 到用户信用等级
				String aString = sheet.getCell(j, i).getContents();
				int a = Integer.valueOf(aString);
				//get到姓名
				String bString = sheet.getCell(j+1,i).getContents();				
				//get到年龄
				String aString2 = sheet.getCell(j+2, i).getContents();
				int a2 = Integer.valueOf(aString2);
				//卡号
				String aString3 = sheet.getCell(j+3, i).getContents();
				int a3 = Integer.valueOf(aString3);
				//密码
				String d = sheet.getCell(j+4, i).getContents();
				//金额
				String aString4 = sheet.getCell(j+5, i).getContents();
				double a4 = Double.valueOf(aString4);
				
				
				Person p1 = new Person(a, bString, a2);
				Card c1 = new Card(a3, d, p1, a4);
				Card.cards.add(c1);
				
				
				/////////
				
				
//				
//				Sheet sheet2 = wb.getSheet(1);
//				for (int i1=0;i1<sheet.getRows();i1++) {
//					for (int j1 = 0;j1<sheet.getColumns();j1++) {
//						
//						//get到姓名
//						String bString22 = sheet.getCell(j1,i1).getContents();	
//						//贷款总额
//						String aString222 = sheet.getCell(j1+1, i1).getContents();
//						int a22 = Integer.valueOf(aString222);
//						String aString22 = sheet.getCell(j1+2, i1).getContents();
//						int a222 = Integer.valueOf(aString22);
//						String aString32 = sheet.getCell(j1+3, i1).getContents();
//						double a32 = Double.valueOf(aString32);
//						String aString42 = sheet.getCell(j1+4, i1).getContents();
//						double a42 = Double.valueOf(aString42);
//						Loan l=new Loan(bString22,a22,a222,a32,a42);//有个空指针异常
//						login.card.getPerson().setMyLoan(l);
//
//						break;
//					}
//				
//				}
//				
				
				/////////////
				break;
			}			
		}
		System.out.println(Card.cards);
		//System.exit(0);
	}

}
