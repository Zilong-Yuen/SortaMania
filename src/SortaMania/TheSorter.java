package SortaMania;

import java.util.Random;

public class TheSorter extends SortCompetition{

	public int challengeOne(int[] arr) {
		selectionSort(arr);
		if(arr.length%2==1)
		{
			return arr[(arr.length)/2];
		}
		else
		{
			return (arr[(arr.length/2)] + arr[arr.length/2-1])/2;
		}
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		return 0;
	}
	@Override
	public int challengeThree(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
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
