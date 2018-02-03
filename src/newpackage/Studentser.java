package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Studentser {  
	public static void main(String []args) throws Exception{
		File src=new File("D:\\Backup.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		sh.createRow(98).createCell(1).setCellValue("simplysitting");
		FileOutputStream fos=new FileOutputStream(new File("D:\\Backup.xlsx"));
		wb.write(fos);
		for(int i=0;i<sh.getLastRowNum();i++){
			try{
				String s1=sh.getRow(i).getCell(0).toString();
				String s=sh.getRow(i).getCell(1).toString();
				//System.out.println(s1);
				//System.out.println(s);
				/*Map<String,String > m=new HashMap<>();
		m.put(s1, s);
		System.out.println(m);*/
			}catch(NullPointerException e){
				e.printStackTrace();
			}
		}

	}


}
