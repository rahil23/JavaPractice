package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class counter {

	public static void main(String[] args) {

		Integer[] a={10,34,56,78,1,2,3,4,5,1,2,3,4,5,6,7,8,9,0};
		nthLargestNo(a, 14);
	}

	public static void nthEvenNo(int n) {

		int count=0;
		for (int i = 1; i < 1000; i++) {
			if (i % 2 == 0) {
				count++;
				
				
			}
			

		}
	}
	
	public static void nthLargestNo(Integer[] a,int n) {

		int count=0;
		
		List m=Arrays.asList(a);
		Set sort=new TreeSet(m);
	/*	Collections.sort(m);
		
		System.out.println(m);*/
		System.out.println(sort);
		
		Iterator iterator =sort.iterator();
		while(iterator.hasNext())
		{
			
			count++;
			int i=(int) iterator.next();
			if(count==n)
			System.out.println(n+"th largest"+i);
			//System.out.println();
		}
	}
	
}
