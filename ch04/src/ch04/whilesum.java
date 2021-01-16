package ch04;

public class whilesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum=sum+i++;
		}
		System.out.println("1~100ÀÇ ÇÕ:"+sum);
	}

}
