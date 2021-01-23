package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet= new TreeSet<Person>();
		
		treeSet.add(new Person("È«±æµ¿",45));
		treeSet.add(new Person("Á¶¿îÈ£",25));
		treeSet.add(new Person("±è³ª¿µ",31));

		Iterator<Person> itr=treeSet.iterator();
		while(itr.hasNext()) {
			Person person=itr.next();
			System.out.println(person.age);
		}

	}

}
