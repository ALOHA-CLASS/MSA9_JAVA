package Day08.Ex01_AnonymousObject;

public interface RemoteControl {
	
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	default void parking(boolean check) {
		if( check ) {
			System.out.println("주차");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행");
			setSpeed(MAX_SPEED);
		}
	}

	static void changeBatter() {
		System.out.println("배터리 교체");
	}
}
