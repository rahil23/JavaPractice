package Array;

public class ArrayCount {
	public static void main(String[] args) {
	/*	int n[]={1,2,3,4,5,6,1,21,1,1,1,3,4};
		int count = 0;
		for (int i = 0; i < n.length-1; i++) {
			
			if(n[0]==n[i])
			{
				count++;
			}
		}
		System.out.println(count);*/
		
		
		int a[]={4,1,4,1,3,2,4,5,1,2,3,4};
		int len = a.length;
		int b[]=new int[len];
		
		for (int i = 0; i < len-1; i++) {
		
			int m=a[i];
			int valueAtIndexm=b[m];
			
			valueAtIndexm++;
			b[m]=valueAtIndexm;
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(i+"   "+b[i]);
		}
		
		
	}

}
