package Day08.DesignPattern.Sigleton;

public class SingleTonTest {

	public static void main(String[] args) {
		// SingleTon singleTon = new SingleTon();
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		// 인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
		System.out.println("s01과 s02 가 같은지 여부");
		System.out.println( s01 == s02 );
		
	}
}
