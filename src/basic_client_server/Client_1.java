package basic_client_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_1 {

	public static void main(String args[])
	{
		try {
		Socket soc=new Socket("localhost",9806);
		System.out.println("Connection Extabished");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client :");
		String str=br.readLine();
		PrintWriter pr=new PrintWriter(soc.getOutputStream(),true);
		pr.print(str);
		}
		catch(Exception e)
		{
			System.out.println("went wrong in client");
		}
	}
}
