package OOPSConcepts1;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.tranfermoney();
		hs.educationLoan();
		hs.carLoan();
		
	}

}

