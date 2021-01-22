package ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1=Util.<Integer>boxing(100);
		int intvalue=box1.get();
		
		Box<String> box2=Util.boxing("ȫ�浿");
		String strvalue=box2.get();
	}

}
