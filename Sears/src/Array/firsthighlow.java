package Array;

public class firsthighlow {

	public static void main(String[] args) {
		int a[] = {33,66,2,4,11,6,44};
		int len = a.length;
		int temp=0;
		for (int i = 0; i < len-1; i++)
		{
			for (int j = 0; j < len-1; j++) 
			{
				if(a[j] > a[j+1])
				{
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		/*int end=a.length-1;
		int sec = 1;
		for (int i = len-1; i >=0; i--) {
			//System.out.print(a[i]+ " ");
			a[sec]=a[end];
			
		System.out.println(a[i]);*/
			
			
		
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println();
			
			System.out.println(a[i]);
		}*/
		System.out.println();
		 
		int sort[]=new int[a.length];
		
		int s=0;
		int e=a.length-1;
		
		for (int i = 0; i < sort.length; i++) {
			if(i==0)
			{	sort[i]=a[s];
			    s++;
		    }
			else if(i%2==1)
			{
				System.out.println("ODD");
				 
				sort[i]=a[e];
				e--;
			}
			else
			{
				System.out.println("Even");
				 
				sort[i]=a[s];
				s++;
			}
			
		}
		
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
		
	}

}