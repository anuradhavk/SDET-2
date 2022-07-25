package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicates {
	public static void main(String[] args) {
		
		String s="Hello";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			//System.out.print(s.charAt(i));
			set.add(s.charAt(i));
			//if we write sop here it will print each and ever line
			//System.out.println(set);
		}
		//if we write sop here it will remove duplicates and give only one output
		System.out.println(set);
	}

}
