package SortaMania;

public class ChallengeOne {
	public static void main(String[] args)
	{
		int[] test1 = {5,3,1,7,2,9,10,2,6,7};
		selectionSort(test1);
		for (int i = 0; i < test1.length; i++)
		{
			System.out.print("[" + test1[i] + "]");
		}
	}
	public static void selectionSort(int[] list1)
	{
		for (int i = 0; i < list1.length-1; i++)
		{
			for (int j = i+1; j < list1.length; j++)
			{
				if (list1[i] > list1[j])
				{
					swap(list1,i,j);
				}
			}
		} 
	}
	public static int Median(int[] list)
	{
		
	}
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}