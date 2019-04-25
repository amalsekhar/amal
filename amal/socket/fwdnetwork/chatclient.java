import java.net.*;
import java.util.*;
import java.io.*;
class chatclient implements Runnable
{static Socket s;
public static void main(String arg[])throws Exception
{
	 s=new Socket("localhost",2000);
	chatclient c1=new chatclient();
	Thread t=new Thread(c1);
	t.start();
	OutputStream OS=s.getOutputStream();
	PrintStream PC =new PrintStream(OS);
	String str="";
	Scanner SC=new Scanner(System.in);
	while(!str.equals("stop"))
	{
		str=SC.next();
		PC.println(str);
	}
System.exit(0);
}

	public void run()
	{	try{InputStream IS=s.getInputStream();
		
		
		Scanner SC =new Scanner(IS);
		String str="";
		while(!str.equals("stop"))
		{	str=SC.next();
			System.out.println(str);
			Thread.sleep(100);
		}}catch(Exception e){ }
	}

}


