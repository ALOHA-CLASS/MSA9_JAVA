package Day08.Ex01_AnonymousObject;

public class AnonymousPerson {
	
	// 익명 자식 객체 생성
	// - 부모클래스 객체명 = new 부모클래스() { 익명객체 정의 }
	Person person1 = new Person() {

		@Override
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
		
	};
	
	Person person2 = new Person() {

		@Override
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("요리를 합니다.");
			System.out.println();
		}
		
	};
	
	void method() {
		person1.name = "김조은";
		person1.age = 20;
		person1.work();
		
		person2.name = "백종원";
		person2.age = 40;
		person2.work();
		
	}
	

}
