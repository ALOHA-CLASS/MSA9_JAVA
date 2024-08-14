package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pikachu {
	
	int energy;
	String type;
	int level;

}
