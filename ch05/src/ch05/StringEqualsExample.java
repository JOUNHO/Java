package ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new X
		String name1="����ȣ";
		String name2="����ȣ";

		//new O
		String name3=new String("����ȣ");
		String name4=new String("����ȣ");
		
		System.out.println("name1�� name2 ����?"+(name1==name2));
		System.out.println("name1�� name3 ����?"+(name1==name3));
		System.out.println("name3�� name4 ����?"+(name3==name4));
	}

}
