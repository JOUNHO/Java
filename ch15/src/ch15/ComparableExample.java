package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet= new TreeSet<Person>();
		
		treeSet.add(new Person("ȫ�浿",45));
		treeSet.add(new Person("����ȣ",25));
		treeSet.add(new Person("�質��",31));

		Iterator<Person> itr=treeSet.iterator();
		while(itr.hasNext()) {
			Person person=itr.next();
			System.out.println(person.age);
		}

	}

}
