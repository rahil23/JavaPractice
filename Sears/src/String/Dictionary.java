package String;

public class Dictionary {
public static void main(String[] args) {
	String a[] = {"xy","abc",  "bcd"};
	int len = a.length;
	String temp="";
	/*for (int i = 1; i < a.length; i++) {
		if(a[i-1].compareTo(a[i])==0)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		System.out.println(a[i]);
		
	}*/


	for (int i = 0; i < a.length-1; i++) {
		if(a[i].compareTo(a[i+1])>0)
		{

			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
//	System.out.println();
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
