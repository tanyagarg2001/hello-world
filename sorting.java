package Arrays.Sorting;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {50,40,30,20,10};
        //BubbleSort(arr);
        InsertSort(arr);
	}
	
	
	public static void BubbleSort(int[] arr)
	{
		int temp;
		int i;
		
		for(i=1; i<arr.length;i++)
		{
			for(int j=0; j<arr.length-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public static void InsertSort(int[] arr)
	{
		int temp;
		int i;
		
		for(i=1;i<arr.length;i++)
		{
			for(int j=1; j<arr.length;j++)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
