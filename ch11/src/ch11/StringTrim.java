package ch11;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   자바 프로그래밍   ";
		String trims=s.trim();
		System.out.println(s);
		System.out.println(trims);

		String tel1="     02";
		String tel2="123   ";
		String tel3="   1234   ";
		
		String tel=tel1.trim()+tel2.trim()+tel3.trim();
		
		System.out.println(tel);

	}

}
