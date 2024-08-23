package Day13.Ex01_Generics;

class Student {}
class Developer {}

class Person {
	
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class ObjectProduct {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setObject( new Student() );
		
		Person person2 = new Person();
		person2.setObject( new Developer() );
		
		// * Object 타입으로 모든 타입을 다룰 수 있다
		// (단점)
		// : 타입 변환이 불가능한 상황이 발생할 수 있다. (ClassCastException)
	}

}






