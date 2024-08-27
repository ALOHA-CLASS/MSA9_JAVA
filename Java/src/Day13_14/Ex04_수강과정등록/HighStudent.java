package Day13_14.Ex04_수강과정등록;

public class HighStudent extends Student {

	public HighStudent(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "HighStudent [" + this.getName() + "]";
	}

}
