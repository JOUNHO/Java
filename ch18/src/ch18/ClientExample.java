package ch18;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try {
			socket=new Socket();
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[���� ����]");
		}catch(Exception e) {
			
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch (IOException e1) {}
		}

	}

}