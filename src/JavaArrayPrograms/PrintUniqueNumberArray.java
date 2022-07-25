package JavaArrayPrograms;

import java.util.HashSet;

public class PrintUniqueNumberArray {
	public static void main(String[] args) {

		int[]a= {8,16,24,32,5,5,7,7,8};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}

		for (Integer it : set) {

			int count=0;

			for(int i=0;i<a.length;i++) {

				if(a[i]==it) {

					count++;
				}
			}

			if(count==1) {
				System.out.println(it+"="+count);
			}
		}
	}


}
