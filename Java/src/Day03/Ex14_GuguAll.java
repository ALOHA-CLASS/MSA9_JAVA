package Day03;

public class Ex14_GuguAll {

	public static void main(String[] args) {
		// (단)x(1~9)
		// 단에 대한 반복  : 1~9
		// 각 단의 곱		: 1~9
		
		// 중첩 반복문(이중 반복문)
		// A X B
		// A : 단
		for (int A = 1; A <= 9; A++) {
			// B : 곱
			for (int B = 1; B <= 9; B++) {
				System.out.print(A + "x" + B + "=" + (A*B));
				System.out.print("\t");	// 탭(공백)
			}
			System.out.println();
		}
		
	}
}




