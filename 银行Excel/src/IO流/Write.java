package IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import basicAttribute.Card;


public class Write {
	
	
	public static void write() throws IOException{
		OutputStream out = new FileOutputStream("F:/IO.xls");		
		HSSFWorkbook wb = new HSSFWorkbook();		
		HSSFSheet sheet = wb.createSheet("银行卡信息");		
		HSSFSheet sheet2 = wb.createSheet("贷款信息");	
		for (int i=0;i<Card.cards.size();i++) {
			HSSFRow row_title = sheet.createRow(i);
			HSSFCell row_title_cell0 = row_title.createCell(0);
			row_title_cell0.setCellValue(Card.cards.get(i).getPerson().getCreditRating());
			HSSFCell row_title_cell1 = row_title.createCell(1);
			row_title_cell1.setCellValue(Card.cards.get(i).getPerson().getName());
			HSSFCell row_title_cell2 = row_title.createCell(2);
			row_title_cell2.setCellValue(Card.cards.get(i).getPerson().getAge());
			HSSFCell row_title_cell3 = row_title.createCell(3);
			row_title_cell3.setCellValue(Card.cards.get(i).getCartnumber());
			HSSFCell row_title_cell4 = row_title.createCell(4);
			row_title_cell4.setCellValue(Card.cards.get(i).getKeynumber());
			HSSFCell row_title_cell5 = row_title.createCell(5);
			row_title_cell5.setCellValue(Card.cards.get(i).getMoney());
			

			if (Card.cards.get(i).getPerson().getMyLoan()!=null) {
				HSSFRow row_title2 = sheet2.createRow(i);
				HSSFCell row_title_cell02 = row_title2.createCell(0);
				row_title_cell02.setCellValue(Card.cards.get(i).getPerson().getName());
				HSSFCell row_title_cell12 = row_title2.createCell(1);
				row_title_cell12.setCellValue(Card.cards.get(i).getPerson().getMyLoan().getMoney());
				HSSFCell row_title_cell22 = row_title2.createCell(2);
				row_title_cell22.setCellValue(Card.cards.get(i).getPerson().getMyLoan().getYear());
				HSSFCell row_title_cell32 = row_title2.createCell(3);
				row_title_cell32.setCellValue(Card.cards.get(i).getPerson().getMyLoan().getRate());
				HSSFCell row_title_cell42 = row_title2.createCell(4);
				row_title_cell42.setCellValue(Card.cards.get(i).getPerson().getMyLoan().get剩余还款数());
			}			
			
		}
		wb.write(out);
		out.flush();
		out.close();
		System.out.print(Card.cards);
	}

}
