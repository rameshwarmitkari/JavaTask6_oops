package Task_6;

public class Account {

	int deposite_balance;
	int withdrwaw;
	int balance;


	Account(){
		System.out.println("no argument constructor called.");
	}

	Account(int balance,int deposite_balance, int withdrwaw){
		this.balance = balance;
		this.deposite_balance = deposite_balance;
		this.withdrwaw = withdrwaw;
	}


	public int depostiBalanlce() {
		balance = balance + deposite_balance; // 1000 + 500
		return balance; //return total balance 1500
	}
	public int withdrawn() {
		balance = balance - withdrwaw;  // 1500 - 200
		return balance;  //1300
	}

	public int checkBalance() {
		return balance;  // 1300
	}


	public static void main(String[] args) {

		Account ac = new Account();
		//1000 is AC balance, 500 is deposited balance , 200 is withdrawn balance
		Account ac1 = new Account(1000,500,200);

		System.out.println("Balance + deposite amount= total balance: "+ac1.depostiBalanlce());
		System.out.println("Balance - withdraw amount: "+ac1.withdrawn());
		System.out.println("Check balance: "+ac1.checkBalance());

	}

}
