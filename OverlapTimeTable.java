public class OverlapTimeTable{

	/****************** Problem _week #3 in JAVA *********************************/
	/*Overlapping Room Question like a period start and end */
	public static void main(String[] args) {



		int[] start = { 30, 0, 60 };// add more array size
		int[] end = { 75, 50, 150 };
		int[] a = { 0, 0, 0 };// add more zeros according to increased array size
		int[] b = { 0, 0, 0 };// add more zeros according to increased array size
		int i, j;
		int count = 0;
		for (i = 0; i < 3; i++)// Change the value of i<arraysize
		{
			a[i] = start[i];
			b[i] = end[i];
			for (j = i + 1; j < 3; j++)// Change the value of j<arraysize
			{
				if ((start[j] >= a[i] && start[j] <= b[i]) || (end[j] >= a[i] && end[j] <= b[i]))
					count++;
			}
		}
		System.out.println(count);

	}

}
