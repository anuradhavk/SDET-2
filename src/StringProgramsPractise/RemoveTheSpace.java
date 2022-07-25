package StringProgramsPractise;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveTheSpace {

	public static void main(String[] args) {

		String s=" hello ";
		String str=s.trim();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			for(int i=str.length()-1;i>=0;i--) {
				if(ch==str.charAt(i)) {
					System.out.println(ch+"="+(i+1));
					break;
				}
			}
		}


	}

}


