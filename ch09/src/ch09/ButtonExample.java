package ch09;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Button();
		
		btn.setOnClickListener(new callListener());
		btn.touch();
		btn.setOnClickListener(new messageListener());
		btn.touch();
	}

}
