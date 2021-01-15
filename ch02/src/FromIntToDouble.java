
public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123456780;
		int num2=123456780;
		
		float num3=num2;
		double num4=num2;
		
		num2=(int) num3;
		int num22=(int) num4;
		
		int result1=num1-num2;
		int result2=num1-num22;
		
		System.out.println("정밀도 손실(float):"+result1);
		System.out.println("정밀도 손실(double):"+result2);

	}

}
