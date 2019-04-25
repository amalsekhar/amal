import java.net.*;
import java.util.*;
import java.io.*;
class server1 
{
public static void main(String arg[]) throws Exception
{
ServerSocket ss=new ServerSocket(5010);
Socket s=ss.accept();
if(s.isConnected()==true)
  System.out.println("connection established");
InputStream IS=s.getInputStream();
Scanner SC =new Scanner(IS);
String str=" ";
while(!str.equals("stop"))
{
str=SC.next();
System.out.println(str);
}
}
}


