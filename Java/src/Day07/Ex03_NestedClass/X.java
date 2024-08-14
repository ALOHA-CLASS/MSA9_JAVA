package Day07.Ex03_NestedClass;

/**
 * 중첩 클래스
 */
public class X {
	
	int xValue1 = 1;
	static int xValue2 = 2;
	
	// 인스턴스 이너 클래스
	class Y {
		int value;
		static int value2 = 100;
		
		Y() {
			System.out.println("X 의 Y 객체 생성");
			System.out.println("value2 : " + value2);
		}
		
		void method1() {
			System.out.println("Y의 메소드");
			System.out.println("Y에서 X클래스의 static 변수 접근 : " + xValue2);
		}
		
		static void method2() {
			System.out.println("Y의 static 메소드");
		}
		
	}
	
	// static 이너 클래스
	// * static 이너 클래스에서는 static 멤버 사용 가능
	static class Z {
		int value1;
		static int value2;
		
		Z() {
			System.out.println("X의 Z 객체 생성");
		}
		
		void method1() {
			System.out.println("Z의 메소드");
		}
		
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
	}
	
	// 로컬 클래스
	// : 메소드 안에 정의한 클래스
	// - 메소드가 실행될 때만 사용되는 이너 클래스
	void method() {
		// 로컬 클래스
		class L {
			int value;
			static int value2;
			
			L() {
				System.out.println("L 객체 생성");
			}
			void method1() {
				System.out.println("L 메소드");
			}
			
			static void method2() {
				System.out.println("L의 static 메소드");
			}
		}
		L l = new L();
		l.value = 10;
		System.out.println("로컬 클래스의 L의 변수 - " + l.value);
		l.method1();
	}

}




