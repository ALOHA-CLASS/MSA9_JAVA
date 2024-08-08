package Day04;

public class Ex05_Arrays {
	
	public static void main(String[] args) {
		// 2차원 배열 선언
		// - 1차원 : 2 (2행)
		// - 2차원 : 3 (3열)
		
		int arr[][] = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		
		// [1][2][3]
		// [4][5][6]
		
		// arr.length		: 첫 번째 차원의 배열요소의 개수
		// arr[i].length	: 두 번째 차원의 배열요소의 개수
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] );
			}
			System.out.println();
		}
		
		// 2차원 배열 선언 및 초기화
		int arr2[][] = { {1,2,3}, {4,5,6} };
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print( arr2[i][j] );
			}
			System.out.println();
		}
	}

}








