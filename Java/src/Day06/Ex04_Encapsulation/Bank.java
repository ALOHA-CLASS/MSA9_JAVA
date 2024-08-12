package Day06.Ex04_Encapsulation;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account(0, "김조은", "282401-04-109955", "국민은행");
		
		// deposit 변수는 private 으로 지정했기 때문에, 접근불가
		// account.deposit = 10000;
		account.setDeposit(10000);
		// * 값을 직접 접근하게 되면, 유효하지 않은 값을 임의로 지정할 수도 있지만,
		//   캡슐화하여, 값을 setter 메소드를 통해서 접근하게 하면, 
		//			   값에 대한 유효성검사와 제약조건을 지정할 수 있다.
		//			    (데이터 보호, 정보 은닉)
		int money = account.getDeposit();
		System.out.println("예금액 : " + money);
		System.out.println(account);
		
	}
}
