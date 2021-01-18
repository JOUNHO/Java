package ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		System.out.println("car1.company:"+car1.Company);
		
		Car car2 =new Car("자가용");
		System.out.println("car2.company:"+car1.Company);
		System.out.println("car2.model:"+car2.model);

		

		Car car3 =new Car("자가용","빨강");
		System.out.println("car3.company:"+car3.Company);
		System.out.println("car3.model:"+car3.model);
		System.out.println("car3.color:"+car3.color);
		System.out.println("car3.maxspeed:"+car3.maxSpeed);
	}

}
