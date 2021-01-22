package ch11;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="자바 프로그래밍";
		
		int location=s.indexOf("프로그래밍");
		System.out.println(location);
		if(s.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요.");
		}
		else {
			System.out.println("자바와 관련없는 책이군요.");

		}
	}

}
