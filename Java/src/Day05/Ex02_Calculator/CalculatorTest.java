package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 덧셈 메소드 호출
		int result1 = calculator.plus(a, b);
		System.out.println("a + b = " + result1);
		
		// 뺄셈 메소드 호출
		int result2 = calculator.minus(a, b);
		System.out.println("a - b = " + result2);
		
		System.out.print("x : ");
		double x = sc.nextDouble();
		System.out.print("y : ");
		double y = sc.nextDouble();
		
		// 곱셈 메소드 호출
		double result3 = calculator.mulple(x, y);
		System.out.println("x * y = " + result3);
		System.out.printf("x * y = %5.2f \n", result3);
		
		// 나눗셈 메소드 호출
		double result4 = calculator.divide(x, y);
		System.out.println("x / y = " + result4);
		System.out.printf("x / y = %5.2f \n", result4);
		
		// 나머지 메소드 호출
		double result5 = calculator.remain(x, y);
		System.out.println("x % y = " + result5);
		
		// printf("포맷", 변수)  : %X.Y(리터럴)
		// - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		// 		 음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// * (리터럴) : %d (정수), %f (실수), %s (문자열)
		int arr[] = {10,20,30,40,50};
		System.out.println("합계 : " + calculator.sum(arr) );
		System.out.println("평균 : " + calculator.avg(arr) );
		sc.close();
	}
}




