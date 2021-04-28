package org.comm;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);

		
		try
		{
			System.out.println(3/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(4);
			System.out.println(5);
		}
		
finally {
	System.out.println("Sucess");
}
	}

}
