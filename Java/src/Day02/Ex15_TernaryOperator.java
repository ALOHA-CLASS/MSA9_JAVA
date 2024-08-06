package Day02;

public class Ex15_TernaryOperator {
	
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		// a와 b의 두 수의 차이(절댓값)을 구하시오.
		// a - b = -2
		// b - a = 2
		// * 조건 연산자
		// - (조건) ? (참일 때 값) : (거짓일 때 값);
		int result = (a > b) ? a - b : b - a;
		System.out.println("두 수의 차 : " + result);
		
		// 조건 연산자를 조건문(if)로 나타내면,
		if( a > b ) 
			result = a - b;
		else
			result = b - a;
		System.out.println("result : " + result);
	}

}
