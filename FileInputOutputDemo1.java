package IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileInputOutputDemo1 
{
  @Test
  public void fileInputOutputDemo() throws IOException
  {
//	    FileInputStream f=new FileInputStream(" C:\\Users\\ADMIN\\Desktop\\IODemo\\test2.txt");
//	    FileOutputStream f=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\IODemo\\test.txt");
	  
	  System.out.println("done");
	  File f1=new File("C:\\Users\\ADMIN\\Desktop\\IODemo\\test3.txt");
	  f1.createNewFile();
	  File f2=new File("C:\\Users\\ADMIN\\Desktop\\IODemo\\abc");
	  f2.mkdir();
	  File f3=new File("C:\\Users\\ADMIN\\Desktop\\IODemo\\x\\y\\z");
	  f3.mkdirs();
	 
	  
  }
  
}
