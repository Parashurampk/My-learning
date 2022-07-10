package OOPSConcepts1;

public class TestCar {

	public static void main(String[] args) {
		
		//Static polymorphism--compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		
		System.out.println("*******************");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*******************");
		
		Car c1=new BMW();//child class object can be referred by parent class reference veriable--dynamic/Run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();

	}

}


















