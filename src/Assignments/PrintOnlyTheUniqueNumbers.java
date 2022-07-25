package Assignments;

import java.util.LinkedHashSet;

public class PrintOnlyTheUniqueNumbers {

	public static void main(String[] args) {

		int[] a= {2,3,4,2,1};

		LinkedHashSet<Integer> set=new LinkedHashSet<>();

		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {

			int count=0;
			for(int i=0;i<a.length;i++) {

				if(count==a[i]) {
					count++;
				}
			}
		//	if(count==1) {
				System.out.println(integer+" "+count);
		//	}
		}
	}
}
