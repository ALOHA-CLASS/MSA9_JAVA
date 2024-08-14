package lombok.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@ 어노테이션

// @NoArgsConstructor		: 기본 생성자 
// @AllArgsConstructor		: 모든 매개변수 생성자
// @RequiredArgsConstructor	: final 및 @NonNull 붙인 변수들을 포함하는 필수 생성자
// @NonNull					: null 이 들어오지 못하도록 지정
// @Getter					: getter
// @Setter					: setter
// @ToString				: toString

// @Data				: @Getter, @Setter, @ToString
//						  @RequiredArgsConstrutor
//						  @EqualsHashCode


@Data
public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;

}






