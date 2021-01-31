package ch18;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inputString=sc.nextLine();
		System.out.println(inputString);
		System.out.println();

		System.out.print("정수 입력> ");
		int inputInt=sc.nextInt();
		System.out.println(inputInt);
		System.out.println();
	}

}
