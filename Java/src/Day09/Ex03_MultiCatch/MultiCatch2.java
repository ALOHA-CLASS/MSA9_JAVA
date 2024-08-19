package Day09.Ex03_MultiCatch;

import java.util.Scanner;

public class MultiCatch2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 수인 정수 2개를 입력해주세요");
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] char1 = str1.toCharArray();	// String --> char[] 변환
		char[] char2 = str2.toCharArray();	// "10"   --> [1][0]
		
		String[] input1 = new String[char1.length];
		String[] input2 = new String[char2.length];
		
		// char1		--> ['1']['0']
		// input1 		--> ["1"]["0"]
		for (int i = 0; i < char1.length; i++) {
			input1[i] = char1[i] + "";
		}
		for (int i = 0; i < char2.length; i++) {
			input2[i] = char2[i] + "";
		}
		
		// 멀티 catch
		// : 하나의 catch 블록에서 처리하고 싶은 예외를 | 기호로 연결하여 함께 처리 
		try {
			System.out.println(input1[0] + input1[1]);
			System.out.println(input2[0] + input2[1]);
			
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1 + " + " + str2 + " = " + result);
		} 
		catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.err.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우)");
			System.err.println("접근할 수 없는 배열 index 범위입니다. (한 자리 수 입력한 경우)");
		} 
		catch (Exception e) {
			System.err.println("이 외의 알 수 없는 예외 발생");
		}
		
		sc.close();
	}

}
