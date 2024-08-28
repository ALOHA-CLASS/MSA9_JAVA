package Day16.Ex02_CharacterStream;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputReaderAndFileWriter {
	
	public static void main(String[] args) {
		// 키보드로 입력한 텍스트를 파일로 저장
		InputStreamReader isr = new InputStreamReader( System.in );
		FileWriter fw = null;
		
		int data = 0;
		try {
			fw = new FileWriter("./src/Day16/Test.txt");
			// 입력
			// ? : 입력은 언제 멈추나?
			// A : End-of-file(EOF) 를 나타내는 기호가 입력되었을 때, 입력이 종료된다.
			// * Window 에서는 ctrl + Z 단축키 입력 시 EOF 가 입력되어 입력 종료를 알립니다.
			while( (data = isr.read() ) != -1 ) {
				// 출력
				fw.write(data);
			}
			isr.close();
			fw.close();
			System.out.println("텍스트 파일이 저장되었습니다.");
		} catch (Exception e) {
			System.err.println("입출력 시, 에러가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
