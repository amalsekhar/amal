import java.io.*;
import java.net.*;
import java.util.*;

public class echoserver 
{
public static void main(String args[]) throws Exception
{


	ServerSocket sok =new ServerSocket(2000);
	Socket so=sok.accept();

	if(so.isConnected()==true)
            System.out.println(" Client Socket is Connected Succecfully. ");

	InputStream in=so.getInputStream();
		Scanner SC =new Scanner(in);
		String str="";
	OutputStream ou=so.getOutputStream();
	PrintStream PC =new PrintStream(ou);
		while(!str.equals("stop"))
		{	str=SC.next();
			System.out.println(str);
			PC.println(str);
		}

	}
 
}





