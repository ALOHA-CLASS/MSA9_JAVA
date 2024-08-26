package Day13.Ex02_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetLotto {
	
	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<>(); 
		Random random = new Random();
		
		// 1~45 랜덤 수, 6개를 lottoSet 컬렉션에 중복 없이 저장
		while( lottoSet.size() < 6 ) {
			int num = random.nextInt(45) + 1; // 1~45 랜덤 수
			boolean check = lottoSet.add(num);
			if( !check ) {
				System.out.println(num + "(이/가) 중복되어서 뽑혀 다시 뽑습니다.");
			}
		}
		System.out.println("로또 번호 : " + lottoSet);
		
		// 오름차순 정렬
		// Set 컬렉션 자체는 순서가 없으므로, 
		// 순서가 있는 List 컬렉션으로 변환한 뒤 정렬할 수 있다.
		
		// HashSet --> ArrayList 로 변환
		List<Integer> lottoList = new ArrayList<Integer>(lottoSet);
		
		// 오름차순 정렬
		Collections.sort(lottoList);
		
		System.out.println("로또 번호 : " + lottoList);
		
	}

}







