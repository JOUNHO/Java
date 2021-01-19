package ch08;

public class Television implements RemoteControl,Searchable{

	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv¸¦ ²ü´Ï´Ù.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("ÇöÀç TV º¼·ý: "+volume);
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("¼­Ä¡");
	}

}
