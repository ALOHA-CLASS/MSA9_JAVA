package Day07.Ex04_NestedInterface;

public class K implements I.J {

	@Override
	public void methodA() {
		System.out.println("중첩 인터페이스 - methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("중첩 인터페이스 - methodB()");
	}

}
