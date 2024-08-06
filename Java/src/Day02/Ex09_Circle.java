package Day02;

import java.util.Scanner;

public class Ex09_Circle {
	
	public static void main(String[] args) {
		// 상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// * 상수 선언 시, 반드시 값으 초기화해야한다.
		// * 선언 후에 값을 변경하면 에러가 발생한다.
		// - 키워드 : final
		final double PI = 3.141592;
		// (에러) PI = 3.14;
		Scanner sc = new Scanner(System.in);
		
		// 원의 넓이 : πr^2
		// 			(원주율) * (반지름)^2
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		// double area = PI * radius * radius;
		double area = PI * Math.pow(radius, 2);
		
		
		System.out.println("원의 넓이 : " + area);
		sc.close();
	}

}
