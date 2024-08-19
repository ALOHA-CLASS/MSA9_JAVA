package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 	예외처리
 *  InputMismatchException
 *  : 입력 시, 자료형이 입력메소드와 일치하지 않아서 발생하는 예외 상황
 *  ex) nextInt() 에 대하여 정수를 입력하지 않고 다른 자료형(문자 등)을 입력한 경우
 */
public class InputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String menuName = "";
		
		do {
			System.out.println("1. Java");
			System.out.println("2. Oracle DB");
			System.out.println("3. HTML CSS JS");
			System.out.println("4. Servlet/JSP");
			System.out.println("5. Spring Framework");
			System.out.println("6. React");
			System.out.println("7. Flutter");
			System.out.println("0. 종료");
			System.out.print("입력 : ");
			
			// 예외 메시지		: java.util.InputMismatchException
			// 예외 상황		: 숫자 입력 메소드에 문자를 입력한 경우
			try {
				// 예외 발생 가능성이 있는 문장
				menuNo = sc.nextInt();		
			} catch (InputMismatchException e) {
				// 숫자를 입력하지 않았다면, 다시 반복해서 입력하도록 처리
				sc.next();
				System.err.println("(0~7) 번 사이의 정수를 입력해주세요.");
				continue;
			}
			// 종료 조건
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
				case 1:	menuName = "Java";				break;
				case 2:	menuName = "Oracle DB";			break;
				case 3:	menuName = "HTML CSS JS";		break;
				case 4:	menuName = "Servlet/JSP";		break;
				case 5:	menuName = "Spring Framework";	break;
				case 6:	menuName = "React";				break;
				case 7:	menuName = "Flutter";			break;
			}
			System.out.println(menuName + "(을/를) 공부합니다.");
		} while (true);
		
		sc.close();
	}
}
