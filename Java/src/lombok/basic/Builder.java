package lombok.basic;

public class Builder {
	
	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.PikachuBuilder()
									 .energy(100)
									 .type("전기")
									 .level(10)
									 .build();
		System.out.println(pikachu);
									 
	}

}
