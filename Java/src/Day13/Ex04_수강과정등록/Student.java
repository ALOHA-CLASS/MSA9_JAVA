package Day13.Ex04_수강과정등록;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student [" + this.getName() + "]";
	}

}
