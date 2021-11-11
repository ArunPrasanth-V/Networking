package basic_client_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {
	public static void main(String args[])
	{
		try {
			System.out.println("Wating for connection!!!");
	    ServerSocket ss=new ServerSocket(9806);
	    Socket soc=ss.accept();
	    System.out.println("get Connected");
	    BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
	    String str=br.readLine();
	    PrintWriter pr=new PrintWriter(soc.getOutputStream(),true);
	    pr.print("Sever says :"+str);
	    
		}
		catch(Exception e)
		{
			System.out.println("Somthing went wrong!!");
		}
	}
}
