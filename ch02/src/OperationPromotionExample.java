
public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue1='A';
		char charValue2=1;
		//char charValue3=charValue1+charValue2; //컴파일 에러
		int intValue=charValue1+charValue2;
		System.out.println("유니코드값="+intValue);
		System.out.println("출력문자="+(char)intValue);

	}

}
