package StringProgramsPractise;

import java.util.LinkedHashSet;

public class CountTheNumOfWordsInString {
	public static void main(String[] args) {
		
		String st="Hi Hi Hello Welcome To Banglore";
		String[] s = st.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
			
		}
		for (String string : set) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(string.equals(s[i])) {
					count++;
				}
			}
			System.out.print(string+"="+count+" ");
		}
		
	}

}
