
public class PascalTriangle {
	public static void main(String[] args) {
		
		int n=5;
		long r=1;
		for(int i=1;i<=n;i++)
		{
			for (int j = 1; j <= i; j++) {
				
				System.out.print(r);
				r=r*10+r;
				System.out.println();
				
			}
			
			
			
		}
		
	}

}
