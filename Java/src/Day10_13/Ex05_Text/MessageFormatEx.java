package Day10_13.Ex05_Text;

import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx {
	
	public static void main(String[] args) {
		// MessageFormat
		// : 문자열 형식을 만들고, 문자열에 따라 들어갈 자리를
		//   {k} 로 표시하여 형식을 지정한다. (k : 0~)
		//   \n : 한 줄 개행(엔터)
		//   \t : 탭
		
		String text= "아이디 : {0}\n비밀번호 : {1}";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		String login = MessageFormat.format(text, id, pw);
		// * ... : 가변 매개변수
		// 가변 매개변수는 매개변수의 개수를 변화시키면서 사용할 수 있도록 해주는 기호
		// 전달 받는 메소드에서는 가변 매개변수를 하나의 배열로 전달받는다.
		// 마지막 매개변수에 정의해야한다.
		
		
		System.out.println(login);
		System.out.println();
		
		String[] studentInfo = {"김조은", "25학번", "컴퓨터공학과", "20살"};
		String studentFormat = "이름 : {0} \n"
						     + "학번 : {1} \n"	
						     + "전공 : {2} \n"	
						     + "나이 : {3} \n"	
				      		 ;
		String student = MessageFormat.format(studentFormat, studentInfo);
		System.out.println(student);
		sc.close();
	}

}
