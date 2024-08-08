package Day04.Class;

public class Jiwoo {

	public static void main(String[] args) {
		// 객체 생성
		// - 클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		// pikachu.energy = 100;
		// pikachu.type = "전기";
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		System.out.println("::::: 피카츄 :::::");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격A : " + pikachu.aAttack());
		System.out.println("공격B : " + pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("::::: 피카츄 :::::");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격A : " + pikachu20.aAttack());
		System.out.println("공격B : " + pikachu20.bAttack());
		System.out.println();
		
	}
}







