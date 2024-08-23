package Day13.Ex02_Collection;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		// Vector 생성 
		// - 학생 목록
		Vector<String> studentList = new Vector<String>();
		
		// 요소 추가 - add()
		studentList.add("김조은");
		studentList.add("강민아");
		studentList.add("장성환");
		studentList.add("김도현");
		studentList.add("배은주");
		
		System.out.println(":::: 학생 목록 ::::");
		System.out.println(studentList);
		System.out.println("------------------");
		
		// 요소 제거 - remove()
		studentList.remove("배은주");
		studentList.remove(1);
		
		System.out.println(":::: 요소 제거 ::::");
		System.out.println(studentList);
		System.out.println("------------------");
		
		// 요소 접근 - get()
		String firstStudent = studentList.get(0);
		System.out.println("첫번째 학생 : " + firstStudent);
		
		// 요소 개수 - size()
		int size = studentList.size();
		System.out.println("남은 학생 수 : " + size);
		
		// 모든 요소 제거 - clear()
		studentList.clear();
		System.out.println(":::: 모든 요소 제거 ::::");
		System.out.println(studentList);
		System.out.println("------------------");
		
		// 요소 전체 추가 - addAll()
		Vector<String> 야근반 = new Vector<String>();
		야근반.add("유지현");
		야근반.add("김동진");
		studentList.addAll(야근반);
		
		System.out.println(":::: 요소 전체 추가 ::::");
		System.out.println(studentList);
		System.out.println("------------------");
	}

}







