package ch11;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ȫ�浿/����ȣ&�ڿ���,�ָ�ȣ";
		
		String names[]=s.split("&|,|/");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
