import java.net.*;
import java.util.*;
import java.io.*;
class client1 
{
public static void main(String arg[]) throws Exception
{
Socket s=new Socket("localhost",5010);
if(s.isConnected()==true)
  System.out.println("connection established");
OutputStream OS=s.getOutputStream();
PrintStream PS=new PrintStream(OS);
Scanner SC=new Scanner(System.in);
String str=" ";
while(!str.equals("stop"))
{
str=SC.next();
PS.println(str);
}
}
}


