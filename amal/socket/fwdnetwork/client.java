import java.net.*;
import java.util.*;
import java.io.*;
class client 
{
public static void main(String arg[]) throws Exception
{
Socket s=new Socket("localhost",5010);
if(s.isConnected()==true)
  System.out.println("Connected to Server");
}
}


