package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatesINWord {
	
	public static void main(String[] args) {
		
		String str="WELcome";
		String s=str.toLowerCase();
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
			}
		//if we write sop here it will remove duplicates and give only one output
		System.out.println(set);
	}

}
