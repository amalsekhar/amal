import java.net.*;
import java.util.*;
import java.io.*;
class chatserver implements Runnable
{	static Socket s;
	public static void main(String arg[])throws Exception
	{
 		chatserver ser=new chatserver();
		ServerSocket ss=new ServerSocket(5100);
		s=ss.accept();
		InputStream IS=s.getInputStream();
		Thread t=new Thread(ser);
		t.start();
		Scanner SC =new Scanner(IS);
		String str="";
		while(!str.equals("stop"))
		{	str=SC.next();
			System.out.println(str);
		}
System.exit(0);
	}

	public void run()
	{	try{OutputStream OS=s.getOutputStream();
		PrintStream PC =new PrintStream(OS);
		String str="";
		Scanner SC=new Scanner(System.in);
		while(!str.equals("stop"))
		{
			str=SC.next();
			PC.println(str);
			Thread.sleep(100);
		}
}catch(Exception e){ }
	}
}


