package JavaArrayPrograms;

import java.util.HashSet;

public class PrintUniqueNumberWithArray {

	public static void main(String[] args) {

		int []a= {8,2,3,4,5,9,5,8,7,7,9};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for (Integer itr : set) {

			int count=0;
			for(int i=0;i<a.length;i++) {

				if(a[i]==itr) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(itr+"="+count);
			}
		}
	}

}
