package Arrays.Sorting;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,3,1,6,8,4};
		int[] ans= mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(ans[i]);
		}

	}
	
	public static int[] merge(int[] one, int[] two)
	{
		int n=one.length + two.length;
		int[] arr=new int[n];
		int i=0,j=0,k=0;
		
		while(i<one.length && j<two.length)
		{
			if(one[i]<two[j])
			{
				arr[k++]=one[i++];
			}
			else if(one[i]>two[j])
			{
				arr[k++]=two[j++];
			}
		}
		
		if(i<one.length)
		{
			while(i<one.length)
			{arr[k++]=one[i++];}
		}
		
		if(j<two.length)
		{
			while(j<two.length)
			{arr[k++]=two[j++];}
		}
		
		
		return arr;
		
	}
	
	public static int[] mergeSort(int[] arr, int low, int high)
	{
		if(low==high)
		{
			int base[]=new int[1];
			base[0]=arr[high];
			return base;
			
		}
		
		int mid=(low+high)/2;
		int[] one=mergeSort(arr,low,mid);
		int[] two=mergeSort(arr,mid+1,high);
		int[] sorted=merge(one,two);
		
		return sorted;
	}

}
