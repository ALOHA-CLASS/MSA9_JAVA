package Day13_14.Ex02_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList 생성 - 쇼핑 카트 (장바구니)
		ArrayList<String> shoppingCart = new ArrayList<String>();
		
		// 요소 추가 - add()
		shoppingCart.add("아웃백 외식상품권 5만원");
		shoppingCart.add("BBQ 황금올리브 반반치킨");
		shoppingCart.add("카카오 프렌즈 피규어");
		
		// 반복 출력
		System.out.println("::::: 장바구니 목록 :::::");
		for (String item : shoppingCart) {
			System.out.println(item);
		}
		
		// 특정 위치에 요소 추가 - add(index)
		shoppingCart.add(1, "맥북 프로");
		System.out.println("::::: 위치에 요소 추가 :::::");
		System.out.println(shoppingCart);
		
		// 요소 제거
		shoppingCart.remove("카카오 프렌즈 피규어");
		System.out.println("::::: 요소 제거 :::::");
		System.out.println(shoppingCart);
		
		// 요소 확인
		// get(index) : index 는 0 부터 시작한다
		String secondItem = shoppingCart.get(1);
		System.out.println("두 번째 아이템 : " + secondItem);
		
		// 요소가 있는지 확인
		boolean hasMacBook = shoppingCart.contains("맥북 프로");
		if( hasMacBook ) System.out.println("맥북 프로 아이템이 있습니다.");
		else System.out.println("해당 아이템이 없습니다.");
		
		// 모든 요소 제거
		shoppingCart.clear();
		System.out.println("::::: 모든 요소 제거 :::::");
		System.out.println(shoppingCart);
		
		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String item = sc.nextLine();
			shoppingCart.add(item);
		}
		
		// 반복1 - for
		System.out.println("반복1 - for");
		for (int i = 0; i < shoppingCart.size(); i++) {
			System.out.println( shoppingCart.get(i) );
		}
		System.out.println("===========================");
		
		// 반복2 - foreach
		System.out.println("반복2 - foreach");
		for (String item : shoppingCart) {
			System.out.println(item);
		}
		System.out.println("===========================");
		
		// 반복3 - Iterator (for)    * for (ctrl+space) 1번 옵션
		System.out.println("반복3 - Iterator (for)");
		for (Iterator iterator = shoppingCart.iterator(); iterator.hasNext() ; ) {
			String item = (String) iterator.next();
			System.out.println(item);
		}
		System.out.println("===========================");
		
		// 반복4 - Iterator (while)
		System.out.println("반복4 - Iterator (while)");
		Iterator<String> it = shoppingCart.iterator();
		while( it.hasNext() ) {
			String item = it.next();
			System.out.println(item);
		}
		System.out.println("===========================");
		sc.close();
	}
}



