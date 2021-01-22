package ch11;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1);
		Student s2=new Student(1);
		Student s3=new Student(2);
		int result=Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result=Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);

	}
	
	
	static class Student{
		int no;
		Student(int no){
			this.no=no;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.no,o2.no);
		}

	}
}
