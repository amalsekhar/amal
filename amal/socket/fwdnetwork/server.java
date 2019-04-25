import java.net.*;
import java.util.*;
import java.io.*;
class server 
{
public static void main(String arg[]) throws Exception
{
ServerSocket ss=new ServerSocket(5010);
Socket s=ss.accept();
if(s.isConnected()==true)
  System.out.println("Connected to client");
}
}


