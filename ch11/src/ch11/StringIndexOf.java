package ch11;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="�ڹ� ���α׷���";
		
		int location=s.indexOf("���α׷���");
		System.out.println(location);
		if(s.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		}
		else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");

		}
	}

}
