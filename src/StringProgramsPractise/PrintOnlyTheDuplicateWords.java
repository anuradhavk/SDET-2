package StringProgramsPractise;

import java.util.LinkedHashSet;

public class PrintOnlyTheDuplicateWords {
	public static void main(String[] args) {
		
		String st="Hi Hi Hello Welcome Bye";
		String[] s = st.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for (String st1 : set) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(st1.equals(s[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(st1+" "+count);
			}
		}
	}

}
