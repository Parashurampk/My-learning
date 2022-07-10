package OOPSConcepts1;

public class HSBCBank implements USBank{

	//if class is implementing any Interface , then it's mandatory to override all the methods of Interface.
	@Override
	public void credit() {
		System.out.println("hsbc--credit");
		
	}

	@Override
	public void debit() {
		System.out.println("hsbc--debit");
		
	}

	@Override
	public void tranfermoney() {
		System.out.println("hsbc--tranfermoney");
		
	}

	public void educationLoan() {
		System.out.println("hsbc--educationloan");
		
	}

	public void carLoan() {
		System.out.println("hsbc--carLoan");
		
	}
	
}
