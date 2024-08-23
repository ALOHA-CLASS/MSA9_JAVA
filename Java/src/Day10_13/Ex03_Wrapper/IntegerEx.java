package Day10_13.Ex03_Wrapper;

public class IntegerEx {

	public static void main(String[] args) {
		// Integer
		// int --> Integer
		// : 정수 타입인 int 기본 타입을 객체화한 클래스
		int a = 10;
		Integer A = 100;
		
		// * 주요 메소드
		// (문자열) 	--> (정수)
		// (정수)	--> (문자열)
		// (정수)	--> (다른타입)
		System.out.println( Integer.parseInt("28") + 2 );  	// 문자열->정수
		System.out.println( Integer.toString(28) + 2 );	   	// 정수->문자열
		System.out.println( 28 + "" );					   	// 정수->문자열
		System.out.println( A.doubleValue() + 2.5 );		// 정수->실수
		System.out.println( Integer.toBinaryString(28));	// 이진수 문자열
		System.out.println( Integer.bitCount(28) );			// 이진수 1비트 개수
		
		// Q. Integer 클래스는 왜 new 로 객체 생성하지 않는가?
		// deprecated : 더 이상 사용을 권장하지 않음
		// Integer i = new Integer(10);
		
		// * 오토 박싱(Auto Boxing)
		// : 자바 5버전 부터는 객체를 생성하여 사용하지 않아도 자동으로 객체를 감싸준다.
		Integer i = 10;						// 박싱 (오토 박싱)
		int value = i.intValue();			// 언박싱
		// * 오토 언박싱(Auto UnBoxing)
		// : Wrapper 클래스 객체의 값을 자동으로 꺼내서 해당 기본 타입에 대입해준다.
		int value2 = i;						// 언박싱 (오토 언박싱)
		System.out.println("객체로 생성한 Integer : " + i);
		System.out.println("기본 타입 int : " + value );
		
	}
}









