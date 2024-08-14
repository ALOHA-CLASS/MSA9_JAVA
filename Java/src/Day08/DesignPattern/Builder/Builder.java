package Day08.DesignPattern.Builder;

public class Builder {
	
	public static void main(String[] args) {
		// new Pikachu(100,"전기");
		// new Pikachu(1,"전기");
		Pikachu pikachu = new Pikachu.Builder()
									 .energy(100)
									 .type("전기")
									 .level(10)
									 .build();
		
		System.out.println(pikachu);
	}

}
