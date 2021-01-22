package ch11;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="홍길동/조운호&박연수,최명호";
		
		String names[]=s.split("&|,|/");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
