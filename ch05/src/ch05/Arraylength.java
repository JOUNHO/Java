package ch05;

import java.util.Scanner;

public class Arraylength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int score[]=new int[3];
		for(int i=0;i<score.length;i++) {
			System.out.print("점수입력>>");
			a=sc.nextInt();
			score[i]=a;
		}
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}

}
