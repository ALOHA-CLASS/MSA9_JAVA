package Day16.Ex02_CharacterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterEx {

	public static void main(String[] args) {
		// 파일 경로
		String filePath = "sample.txt";
		
		try (
			// FileWriter 객체를 사용하여, 문자 단위로 데이터를 출력
			FileWriter fw = new FileWriter(filePath);
			// BufferedWriter 객체를 이용하여, 데이터 출력 성능 향상 
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			bw.write("Hello World~!\n");
			bw.write("This is kim jo eun\n");
			
			System.out.println("sample.txt 파일을 저장하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
