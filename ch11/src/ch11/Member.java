package ch11;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name=name;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
			return this.name.compareTo(o.name);
		
	}

}
