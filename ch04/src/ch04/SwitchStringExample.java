package ch04;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position="과장";
		
		switch(position){
			case "부장":
				System.out.println("부장");
				break;
			case "과장":
				System.out.println("과장");

			case "주민":
				System.out.println("break없어서 연달아 실행");
				break;
		
		}
	}

}
