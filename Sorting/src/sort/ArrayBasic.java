xpackage sort;

public class ArrayBasic {
	public static void main(String[] args) {
		int a[]={1,0,0,0,1,1,1,1,0,1,0,1};
		int count=0;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==0)
			{
				count++;
				
			}
			
		}System.out.println(count);
	}

}
