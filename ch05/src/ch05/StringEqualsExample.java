package ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new X
		String name1="조운호";
		String name2="조운호";

		//new O
		String name3=new String("조운호");
		String name4=new String("조운호");
		
		System.out.println("name1과 name2 같나?"+(name1==name2));
		System.out.println("name1과 name3 같나?"+(name1==name3));
		System.out.println("name3과 name4 같나?"+(name3==name4));
	}

}
