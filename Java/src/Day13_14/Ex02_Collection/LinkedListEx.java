package Day13_14.Ex02_Collection;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		// LinkedList 생성 - 재고 목록
		LinkedList<String> inventoryList = new LinkedList<String>();
		
		inventoryList.add("모자 - 10개");
		inventoryList.add("청바지 - 20개");
		inventoryList.add("티셔츠 - 5개");
		
		System.out.println("::::: 재고 목록 :::::");
		System.out.println(inventoryList);
		
		// 첫번째, 마지막 아이템 가져오기
		String firstItem = inventoryList.getFirst();
		String lastItem = inventoryList.getLast();
		
		System.out.println("첫 번째 아이템 : " + firstItem);
		System.out.println("마지막 아이템 : " + lastItem);
		
		// 첫번째, 마지막 아이템 제거
		inventoryList.removeFirst();
		inventoryList.removeLast();
		System.out.println("::::: 재고 목록 :::::");
		System.out.println(inventoryList);
		
		// 첫번째, 마지막 아이템 추가
		inventoryList.addFirst("신상 - 100개");
		inventoryList.addLast("이월 상품 - 500개");
		System.out.println("::::: 재고 목록 :::::");
		System.out.println(inventoryList);

		System.out.println("상품 종류 개수 : " + inventoryList.size());
		
		inventoryList.clear();
		System.out.println("::::: 재고 목록 :::::");
		System.out.println(inventoryList);
		
	}

}
