package assignments.week3.day1;


public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		System.out.println("Amount deposited in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();		
		ab.deposit();
	}

}
