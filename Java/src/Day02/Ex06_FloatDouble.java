package Day02;

public class Ex06_FloatDouble {

	public static void main(String[] args) {
		// 실수 타입 변수 선언
		// float 타입 리터럴		: 실수F
		// double 타입 리터럴		: 실수D
		// ✅ double 타입 리터럴 D 생략가능
		double var1 = 3.14;
		double var2 = 3.14D;
		
		float var3 = 3.14F;
		
		// 실수형 정밀도
		double var4 = 0.123456789123456789D;
		float var5 = 0.123456789123456789F;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}
