package Day02;

import java.util.Scanner;

public class Ex07_Boolean {

	public static void main(String[] args) {
		// boolean
		// : true(참), false(거짓) 논리값만 가지는 자료형
		boolean check1 = false;
		boolean check2 = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("true or false : ");
		boolean on = sc.nextBoolean();
		
		if( on ) {
			System.out.println("전원 ON");
		}
		else {
			System.out.println("전원 OFF");
		}
	}
}





