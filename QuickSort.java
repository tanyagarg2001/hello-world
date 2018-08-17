package Arrays.Sorting;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,2,1,6,8,5,3,4};
		quicksort(arr, 0, 7);
	}
	
	public static void quicksort(int[] arr,int start, int end)
	{
		if(start>=end)
		{
			return;
		}
		
		int pindex=partition(arr,start,end);
		quicksort(arr, start, pindex-1);
		quicksort(arr, pindex+1, end);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int partition(int[] arr, int start, int end)
	{
		int pindex=start;
		int pivot=arr[end];
		
		for(int i=start; i<=end;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp;
				pindex++;
			}
		}
		
		int temp=arr[end];
		arr[end]=arr[pindex];
		arr[pindex]=temp;
		
		return pindex;	
	}

}
