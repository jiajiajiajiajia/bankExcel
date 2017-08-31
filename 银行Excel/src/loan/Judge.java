package loan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import basicAttribute.Card;
import basicAttribute.Person;
import basicFunction.login;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Judge {
	

	public Judge() throws BiffException, IOException {
		boolean flag = false;		
		File file =new File("F:/IO.xls");
		InputStream in = new FileInputStream(file.getAbsolutePath());
		Workbook wb = Workbook.getWorkbook(in);
		Sheet sheet = wb.getSheet(1);
		for (int i=0;i<sheet.getRows();i++) {
			for (int j = 0;j<sheet.getColumns();j++) {
				
				//get到姓名
				String bString = sheet.getCell(j,i).getContents();					
				
				
				if (login.card.getPerson().getName().equals(bString))
				{
					flag = true;
					System.out.println("您已经在本银行带过款了，而且还没有还清。不允许再次贷款。");
					
					/////读取其他信息
					//贷款总额
//					String aString = sheet.getCell(j+1, i).getContents();
//					int a = Integer.valueOf(aString);
//					String aString2 = sheet.getCell(j+2, i).getContents();
//					int a2 = Integer.valueOf(aString2);
//					String aString3 = sheet.getCell(j+3, i).getContents();
//					double a3 = Double.valueOf(aString3);
//					String aString4 = sheet.getCell(j+4, i).getContents();
//					double a4 = Double.valueOf(aString4);
//					Loan l=new Loan(bString,a,a2,a3,a4);//有个空指针异常
//					login.card.getPerson().setMyLoan(l);

					break;
				}
				
			}			
		
		
		}if (flag == false) {
		Loan l1=new Loan(login.card.getPerson());
		login.card.getPerson().setMyLoan(l1);
	}
}
	


}
