package Day09.Ex07_Review.추상클래스;

public abstract class Computer {
	
	// * 추상 메소드
	// 추상 메소드 정의하려면, abstract 키워드를 붙여주어야한다.
	//					  클래스도 abstract 붙인 추상클래스가 되어야한다.
	public abstract void display();
	public abstract void typing();
	
	public void on() {
		System.out.println("전원을 켭니다");
	}
	
	public void off() {
		System.out.println("전원을 끕니다");
	}

}
