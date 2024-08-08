package Day04;

import java.util.Scanner;

public class Ex02_Max {
	
	public static void main(String[] args) {
		// 첫 번째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최댓값을 구하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최댓값 : 100
		/*
		 	(순서도)
		 	1. 정수 하나 입력받아서 N에 대입
		 	2. N개 요소를 갖는 배열 선언 및 생성
		 	3. N번 만큼 N개의 정수 입력받아서 배열 arr 대입
		 	4. 배열을 반복해서 최댓값 max 배열의 i번째 요소와 비교
		 	5. 두 요소 중에서 더 큰 요소를 max에 대입
		 	6. 반복 끝나고, max 를 출력
		*/
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Integer.MIN_VALUE : -21억xxx  : int 의 최솟값
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
			}
		}
		
		System.out.println("최댓값 : " + max);
		sc.close();
	}

}




