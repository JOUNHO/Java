package ch14;

public class returninterfacecEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnInterface ri;
		ri=(x,y)->{
			int result=x+y;
			return result;
		};
		
		System.out.println(ri.method(2, 3));
	}

}