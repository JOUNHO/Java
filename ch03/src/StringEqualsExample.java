
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="����ȣ";
		String s2=new String("����ȣ");

		
		System.out.println(s=="����ȣ");
		System.out.println(s2==s);
		
		System.out.println(s.equals("����ȣ"));
		System.out.println(s.equals(s2));

	}

}
