package Programs;

public class PH16_MaxAndMinValuesInArray {

	public static void main(String[] args) {

		int a[] = { 20, 100, 40, 20, 60 };

		int max = a[0];

		for (int i = 1; i < a.length; i++)
			if (a[i] > max) // change < will get min value
			{
				max = a[i];
			}
		System.out.println(max);
	}

}
/*
	public static void main(String[] args)
	{
    	int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
    	int largest = 0;
    	int secondLargest = 0;
    	System.out.println("The given array is:");
    	for (int i = 0; i < arr.length; i++)
    	{
       		System.out.print(arr[i] + "\t");
    	}
    	
    	for (int i = 0; i < arr.length; i++)
    	{
        	if (arr[i] > largest)
        {
            secondLargest = largest;
            largest = arr[i];
        }
        
        else if (arr[i] > secondLargest)
        {
            secondLargest = arr[i];
        }
      }
    System.out.println("\nSecond largest number is:" + secondLargest);
    System.out.println("Largest Number is: "  +largest);
	}
}

*/