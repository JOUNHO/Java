package ch04;

public class breakoutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.println(i+"°ú"+j);
				if(j==4) {
					break Outter;
				}
			}
		}
		System.out.println("Á¾·á");


	}

}
