package Day13.Ex02_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 요소 추가
		map.put("제니", 100);
		map.put("리사", 90);
		map.put("로제", 80);
		map.put("지수", 70);
		
		// 기존에 있는 key "제니"를 중복해서 추가
		// * 중복해서 key 를 추가하면, 마지막에 추가한 값으로 지정된다.
		map.put("제니", 99);
		
		System.out.println("총 개수  :" + map.size());
		System.out.println();
		
		System.out.println("제니의 코딩 성적 : " + map.get("제니"));
		System.out.println("리사의 코딩 성적 : " + map.get("리사"));
		
		// Map 반복 1
		Set<String> keySet = map.keySet();		// Map 에서 key만 Set 컬렉션으로 반환
		
		// key : 제니, 리사, 로제, 지수
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// Map 반복 2 - Iterator 사용
		// map.entrySet()			: iterator() 메소드를 가진 Set 객체 반환
		// entrySet.iterator()		: Map 컬렉션을 순차검색할 수 있는 iterator 객체를 반환
		// * Entry : 키와 값(key, value)를 한 쌍으로 저장한 자료구조

		// entry 를 반복시켜주는 반복자(iterator)를 반환하는 iterator() 메소드를 가진 Set
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// entry를 반복시켜주는 반복자
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while( entryIterator.hasNext() ) {	// 다음 요소 존재 여부 확인
			Map.Entry<String, Integer> entry = entryIterator.next(); // 다음 요소(entry)를 반환
			String key = entry.getKey();				// 키	
			Integer value = entry.getValue();			// 값
			
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// Map 반복 3 - formap
		// * formap 키워드로 자동 완성
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " : " + val);
		}
		System.out.println();
		
		System.out.println("총 개수 : " + map.size());
		map.clear();	// 모든 요소 삭제
		System.out.println("empty 여부 : " + map.isEmpty());		// Map 이 비었는지 확인
	}

}







