package StringProgramsPractise;

import java.util.LinkedHashSet;

public class OrderOfOcceranceOfEachCharcterByRemovingDuplicates {
	public static void main(String[] args) {
		
		
		String s="Hello";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
			
		}
		for (Character character : set) {
			
			for(int i=0;i<s.length();i++) {
				if(character==s.charAt(i)) {
					System.out.println(character+"="+(i+1));
					break;
				}
			}
		}
		
		
	}

}
