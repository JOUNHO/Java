package ch06;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("123456-1234567","��ȣ");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation-"usa";
		//p1.ssn="13241-432432";  final �ʵ� ���� �Ұ�
		p1.name="����ȣ";
	}

}
