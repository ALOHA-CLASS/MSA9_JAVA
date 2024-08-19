package Day09.Ex02_ClassCasting;

public class DownCasting {
	
	public static void main(String[] args) {
		// 다운 캐스팅 (강제 형 변환)
		// * 전제 조건 : 업 캐스팅
		// - 다운 캐스팅은 업 캐스팅된 부모 객체를 자식 객체로 변환하는 것
		// - 업 캐스팅		: (부모) <- (자식)
		// - 다운 캐스팅	: (자식) <- (부모)
		
		// 업캐스팅
		Person person = new Student("김조은", 20, 1, "컴퓨터공학과");
		System.out.println( person );
		System.out.println( person.work() );
		
		// 다운 캐스팅
		Student student = (Student) person;
		System.out.println( student );
		System.out.println( student.work() );
		
		System.out.println("grade : " + student.grade);
		System.out.println("major : " + student.major);
	}
}





