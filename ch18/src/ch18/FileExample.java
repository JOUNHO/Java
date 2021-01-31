package ch18;

import java.io.FileInputStream;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis= new FileInputStream("F:/Java/ch18/src/ch18/FileExample.java");
			int data;
			while((data=fis.read())!=-1) {
				System.out.write(data);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
