
public class ChildExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Child();
		parent.field1= "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 ="data2"; //�Ұ���
		 parent.method3();//�Ұ���

		 */
		Child child=(Child) parent;
		System.out.println(child.field1);
		child.field2="yyy";
		child.method3();
	}

}
