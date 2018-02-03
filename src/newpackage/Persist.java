package newpackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		Studentser s=new Studentser();
		 FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s);  
		  out.flush();  
		  System.out.println("success");  

	}

}
