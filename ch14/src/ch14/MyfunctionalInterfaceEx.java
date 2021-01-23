package ch14;

public class MyfunctionalInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		
		fi=()->{
			String str="method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi=()->{
			System.out.println("method call2");
		};
		fi.method();
		
	}

}
