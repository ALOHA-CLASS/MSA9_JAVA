package Day09.Ex07_Review.추상클래스;

public class User {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		// Computer computer2 = new Laptop();
		// 추상 클래스는 객체로 생성할 수 없다.
		
		Computer computer2 = new MacBook();
		Laptop laptop = new MacBook();
		MacBook macBook = new MacBook();
		// DeskTop deskTop = new MacBook();
		// * MacBook 은 DeskTop 클래스와 부모/자식 관계가 아니기 때문에 업캐스팅 불가
		
		computer.on();
		computer.display();
		computer.typing();
		computer.off();
		System.out.println();
		
		computer2.on();
		computer2.display();
		computer2.typing();
		computer2.off();
		System.out.println();
		
		laptop.on();
		laptop.display();
		laptop.typing();
		laptop.off();
		System.out.println();
		
		macBook.on();
		macBook.display();
		macBook.typing();
		macBook.off();
		System.out.println();
	}
}




