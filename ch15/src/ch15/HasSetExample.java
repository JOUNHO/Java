package ch15;

import java.util.HashSet;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set=new HashSet();
		
		set.add(new Member("����ȣ",30));
		set.add(new Member("����ȣ",30));
		System.out.println("�� ��ü��: "+set.size());

	}

}
