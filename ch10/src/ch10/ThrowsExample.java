package ch10;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
	public static void findClass() throws ClassNotFoundException{
		Class lass =Class.forName("java.lang.String2");
	}

}
