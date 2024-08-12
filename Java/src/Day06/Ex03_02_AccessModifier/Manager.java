package Day06.Ex03_02_AccessModifier;

import Day06.Ex03_01_AccessModifier.Person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defualtSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		// * 선언한 클래스를 기준으로 접근지정자가 적용된다.
		// 같은 패키지인 Manager 클래스에서 Student 클래스의 
		// default 접근지정자인 height를 접근할 수 없는 이유?
		// - 실질적으로 height 를 선언한 곳은 다른 패키지인 Person 클래스이 때문에 접근 불가
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		System.out.println();
		
		Person person = new Person();
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.getAge());
		System.out.println("height : " + person.getHeight());
		System.out.println("weight : " + person.getWeight());
		System.out.println();
	}

}



