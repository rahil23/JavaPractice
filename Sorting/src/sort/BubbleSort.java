package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {120,2,13,22,21,4,1,5}; 
		int len = a.length;
		int temp=0;
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
			for (int j = 0; j <= a.length-1; j++) {
				System.out.println(a[j]);
			
		
		}
		
	}
}
