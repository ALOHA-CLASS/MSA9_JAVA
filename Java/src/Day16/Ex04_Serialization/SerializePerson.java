package Day16.Ex04_Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializePerson {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 입력
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");		
		int age = sc.nextInt();

		// Person 객체 생성
		Person person = new Person(name, age);
		
		// Person 객체 직렬화
		// : 객체를 바이트 데이터로 변환하여 파일로 저장
		try (
				FileOutputStream fos = new FileOutputStream("Person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) 
		{
			oos.writeObject(person);
			System.out.println("Person 객체를 직렬화하여 Person.dat 에 저장하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}




