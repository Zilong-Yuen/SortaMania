package SortaMania;

import java.util.Random;

public class TheSorter extends SortCompetition{
	
	public int challengeOne(int[] arr) {
		selectionSort(arr);                                                
		return Median(arr);
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals(query))
			{
				return i;
			}
		}
		return -1;
	}
	@Override
	public int challengeThree(int[] arr) {
		for (int i = 0; i < arr.length*.75; i++)
		{
			for (int j = i+1; j < arr.length*.75; j++)
			{
				if (arr[i] > arr[j])
				{
					swap(arr,i,j);
				}
			}
		} 
	}

	@Override
	public int challengeFour(int[][] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeFive(Object[] arr, Object query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() {
		return null;
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
	
	public static void bubbleSort(String[] list1)
	{
		for (int i = 0; i < list1.length; i++)
		{
			for (int j = i+1; j < list1.length; j++)
			{
				if (list1[i].compareTo(list1[j]) < 0)
				{
					String temp = list1[i];
					list1[i] = list1[j];
					list1[j] = temp;
				}
				if (list1[j].compareTo(list1[i]) < 0)
				{
					String temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}

	public static int Median(int[] list)
	{
		if(list.length%2==1)
		{
			return list[(list.length)/2];
		}
		else
		{
			return (list[(list.length/2)] + list[list.length/2-1])/2;
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
		int x = rand.nextInt(10000) + 1;
		for(int i = 0; i<name.length;i++)
		{
			name[i] = x;
		}
		return name;
	}
}
