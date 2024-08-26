package Day13.Ex01_Generics;

import Day04.Class.Pikachu;

public class BoxEx {

	public static void main(String[] args) {
		// 제네릭
		// : 모든 클래스 타입을 다룰 수 있도록
		//   클래스와 메소드를 정의하는 기법
		// - 타입 매개변수 : 모든 클래스타입을 일반화한 변수
		// - 객체를 생성할 때, 타입을 결정한다.
		// - 구조 : class 클래스명 <타입매개변수1, 타입매개변수2> { }
		// - 예시 : class Box<T> { }
		// - 생성 : Box<클래스> box = new Box<클래스>();
		
		Box<String> box1 = new Box<String>();
		box1.setT("쿠팡택배");
		String boxName = box1.getT();
		System.out.println("box1 : " + boxName);
		
		Box<Pikachu> monsterBall = new Box<Pikachu>();
		monsterBall.setT( new Pikachu() );
		Pikachu pikachu = monsterBall.getT();
		System.out.println("pikachu : " + pikachu);
		
		// * 제네릭 기법의 타입으로는 "참조자료형"만 사용할 수 있다
		// * 기본 타입은 지정할 수 없다.
		// (에러) Box<int> boxInt = new Box<int>();
		
		Box<int[]> snackBox = new Box<int[]>();
		snackBox.setT( new int[] {1,2,3,4,5} );
		int[] snackArr = snackBox.getT();
		for (int i : snackArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	} 
}











