package entities;

public class Account {
	
	private int number;
	public String holder;
	private double balance;	
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double valor) {
		this.balance += valor;
	}
	
	public void saque(double valor) {
		this.balance -= valor + 5.00;
	}

	
	@Override
	public String toString() {
		return  "Account: " + this.getNumber()
				+ ", Holder: " + this.getHolder()
				+ ", Balance: $ " + String.format("%.2f", this.getBalance());
	}
	
	

}
