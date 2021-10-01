import java.io.*;  
import java.util.Scanner;

// Java program to write data in excel sheet using java code
  
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class ReadLineByLineExample1  
{  
public static void main(String args[])  
{  
try  
{  
File file=new File("Demo.txt");    //creates a new file instance  
FileReader fr=new FileReader(file);   //reads the file  
BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
String line;  
while((line=br.readLine())!=null)  
{ 
sb.append(line);      //appends line to string buffer  
sb.append("\n");     //line feed 
String newline = String.valueOf(line);  
String [] arrOfStr = newline.split(" ",0);
for (String a : arrOfStr){
            System.out.println(a);
    }
}  
fr.close();    //closes the stream and release the resources  
System.out.println("Contents of File: ");  
System.out.println(sb.toString());   //returns a string that textually represents the object  
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  
