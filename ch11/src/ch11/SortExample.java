package ch11;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]= {99,97,98};
		Arrays.sort(score);
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]="+score[i]);
		}
		
		Member m1=new Member("ȫ�浿");
		Member m2=new Member("�ڱ浿");
		Member m3=new Member("��浿");
		Member member[]= {m1,m2,m3};
		
		Arrays.sort(member);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("member["+i+"]="+member[i].name);
		}
	}
	

}
