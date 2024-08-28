package Day16.Ex04_Serialization;

import java.io.Serializable;

// 직렬화 
// * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
public class Person implements Serializable {

	// 직렬화 버전 UID
	// private static final long serialVersionUID = 8987500998854844562L;
	private static final long serialVersionUID = -4760029717359718422L;
	
	private String name;
	private int age;
	// 변수 추가
	private String address;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
