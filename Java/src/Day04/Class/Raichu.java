package Day04.Class;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	// 부모 클래스의 생성자를 따라서 자동완성
	// : alt + shift + S : C
	public Raichu() {
		super(300, "메가전기");
	}

	public Raichu(int energy) {
		super(energy, "메가전기");
	}
	
	public Raichu(int energy, String type) {
		super(energy, type);
	}

	// 메소드 오버라이딩
	// : 부모 클래스의 메소드를 자식 클래스에서 재정의하여,
	//   부모 메소드를 무시하고, 자식 메소드를 우선하여 실행하는 것
	// 오버라이딩 자동완성 : alt + shift + S : v
	// * 어노테이션 : 코드에 특별한 기능 또는 설명을 추가하는 방법
	//   "@어노테이션이름" 의 형태로 사용한다. 
	
	@Override			// 부모 클래스의 메소드를 재정의한 메소드임을 명시하는 어노테이션 (생략가능)
	public String aAttack() {
		return "백만볼트";
	}
	
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		return "아이언테일";
	}

	
	
}








