package Day06.Ex02_ObjectArray;

import java.util.Scanner;

/**
 *  책제목, 저자명을 갖는 Book 클래스를 정의하고,
 *  Book 클래스타입의 객체 배열을 생성하여
 *  사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 */

// ** 하나의 클래스 파일 안에 여러 개의 클래스를 정의할 수 있다.
class Book {
	String title, author;			// 책제목, 저자명


	// 생성자
	// alt + shift + S, O
	public Book() {
		// this.title = "제목없음";
		// this.author = "작자미상";
		this("제목없음", "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// toString()
	// : 객체를 출력문에 출력 시, 출력할 템플릿 메시지를 지정하는 메소드
	// - Object(최상위클래스)에 정의된 toString() 메소드를 오버라이딩하면,
	//   반환값을 출력문에서 출력하는 객체를 대신하여 출력합니다.
	//   Object - toString() : "패키지.클래스명@해시코드"
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
}

public class BookArray {
	
	public static void main(String[] args) {
		// 객체 배열
		// Book 타입의 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			// Book 객체를 생성하여 객체 배열 bookArray 에 대입
			bookArray[i] = new Book(title, author);
		}
		
		// 출력
		for (Book book : bookArray) {
			System.out.println(book);
		}
		
		sc.close();
	}

}









