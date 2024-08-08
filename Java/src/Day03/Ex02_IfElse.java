package Day03;

import java.util.Scanner;

public class Ex02_IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if( num % 2 == 1 ) 
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다.");
		
		sc.close();
	}
}
