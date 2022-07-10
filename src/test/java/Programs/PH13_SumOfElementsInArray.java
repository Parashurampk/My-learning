package Programs;

public class PH13_SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,7,9,16};
		int sum=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is :"+sum);
	}

}
