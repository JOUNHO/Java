package ch08;

public class RemoteControllerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc=new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		Searchable se;
		se=new Television();
		se.search();
		Television tv=new Television();
		tv.search();
	}

}
