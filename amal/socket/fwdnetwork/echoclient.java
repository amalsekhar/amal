import java.io.*;
import java.net.*;
import java.util.*;
public class echoclient
{
public static void main(String args[]) throws Exception
{


Socket sok=new Socket("localhost",2000);
if(sok.isConnected()==true)
            System.out.println(" Server Socket is Connected Succecfully. ");

OutputStream ou=sok.getOutputStream();
PrintStream PC =new PrintStream(ou);
	String str="";
Scanner SC=new Scanner(System.in);
InputStream in=sok.getInputStream();
        Scanner SC1 =new Scanner(in);
	while(!str.equals("stop"))
	{
		str=SC.next();
		PC.println(str);
                System.out.println("Echoed data:"+SC1.next());
	}

		


}
}
