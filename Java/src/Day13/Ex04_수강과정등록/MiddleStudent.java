package Day13.Ex04_수강과정등록;

public class MiddleStudent extends Student {

	public MiddleStudent(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "MiddleStudent [" + this.getName() + "]";
	}

}
