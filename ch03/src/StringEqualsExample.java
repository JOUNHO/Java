
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="조운호";
		String s2=new String("조운호");

		
		System.out.println(s=="조운호");
		System.out.println(s2==s);
		
		System.out.println(s.equals("조운호"));
		System.out.println(s.equals(s2));

	}

}
