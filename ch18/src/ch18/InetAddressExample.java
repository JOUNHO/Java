package ch18;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local=InetAddress.getLocalHost();
			System.out.println("郴 哪腔磐 IP林家: "+local.getHostAddress());
			
			InetAddress[] iaArr=InetAddress.getAllByName("www.naver.com");
			for(InetAddress remot : iaArr) {
				System.out.println("www.naver.com Ip林家: "+remot.getHostAddress());
			}
		} catch (java.net.UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
