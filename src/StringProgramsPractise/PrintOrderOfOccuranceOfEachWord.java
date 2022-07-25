package StringProgramsPractise;

import java.util.LinkedHashSet;

public class PrintOrderOfOccuranceOfEachWord {
	public static void main(String[] args) {


		String st="Hi Hi Hello Welcome Bye";
		String[] s = st.split(" ");

		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);

		}
		for (String string : set) {
			for(int i=0;i<s.length;i++) {
				if(string.equals(s[i])) {
					System.out.println(string+"="+(i+1));
					break;

				}
			}
		}
	}
}


