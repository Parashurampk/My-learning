package OOPSConcepts1;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void tranfermoney();
	
	//only method declaration---not definition
	//we can declare variables --by default static in nature
	//variables value will not be changed--final in nature
	//no static method in Interface
	//no main method in interface 
	//we can not create the object of Interface 
	//Interface is abstract in nature
	

}
