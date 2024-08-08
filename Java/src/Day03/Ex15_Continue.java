package Day03;

import java.util.Scanner;

public class Ex15_Continue {
	
	public static void main(String[] args) {
		// 5개의 정수를 입력받아
		// 입력받은 정수 중 양수(+)만 합계를 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		// -3 -1  1  3  5
		// 5번 반복 
		// 반복변수 i : 0 ~ 4
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			// 음수인 경우 제외
			if( n < 0 )
				continue;
			// continue
			// : 남은 실행문을 무시하고, 다음 반복으로 점프
			// - while : 조건식으로 돌아간다
			// - for   : 증감식으로 돌아간다 
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}

}







