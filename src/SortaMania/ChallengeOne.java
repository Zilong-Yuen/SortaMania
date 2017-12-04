package SortaMania;
import java.util.Random;

public class ChallengeOne {
	public static void main(String[] args)
	{
		int[] test1 = {5,3,1,7,2,9,10,2,6, 9, 10, 19};
		selectionSort(test1);
		for (int i = 0; i < test1.length; i++)
		{
			System.out.print("[" + test1[i] + "]");
		}
		System.out.print("\nMedian: " + Median(test1));
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
	public static double Median(int[] list)
	{
		if(list.length%2==1)
		{
			return list[(list.length)/2];
		}
		else
		{
			//return (list[(list.length/2)] + list[list.length/2-1])/2;
			return list[]
		}
	}
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int[] GenerateArr()
	{
		int[] name = new int[10000];
		Random rand = new Random();
		for(int i = 0; i<name.length;i++)
		{
			
		}
	}
}