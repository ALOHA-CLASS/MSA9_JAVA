package Day02;

import java.util.Scanner;

public class Ex16_Var {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var num = sc.nextInt();
		var text = sc.nextLine();
		System.out.println("int 타입으로 추론된 num : " + num);
		System.out.println("String 타입으로 추론된 text : " + text);
		
	}

}
