package SortaMania;

public class TheSorter extends SortCompetition{

	public int challengeOne(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
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

}
