package Day09.Ex06_UserException;

public class Account {
	
	private long balance;			// 예금 잔액

	public Account() {
		
	}

	public long getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws BalanceException {	// 예외 전가
		// (잔고) < (출금액)		: 출금할 수 없음
		if( balance < money ) {
			// 예외 강제 발생
			// - throw new ???Exceptoin();
			throw new BalanceException("잔고가 부족합니다." + (money-balance) + "원이 부족합니다.");
		}
		balance -= money;
	}
	

}







