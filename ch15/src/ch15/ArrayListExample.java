package ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Spring");
		list.add(2,"DB");
		list.add("Mysql");
		
		int size=list.size();
		System.out.println("ÃÑ °´Ã¼¼ö:"+size+"\n");
		int i=0;
		for(String s:list) {
			System.out.println(i++ +":"+s);
		}
		
		list.remove(2);
		list.remove("Mysql");
		System.out.println();
		i=0;
		for(String s:list) {
			System.out.println(i++ +":"+s);
		}
	}

}
