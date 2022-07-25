package StringPrograms;

import java.util.LinkedHashSet;

public class ConvertUperCaseAndRemoveTheDuplicates {
	public static void main(String[] args) {


		String s="welcome";
		String str=s.toUpperCase();

		LinkedHashSet<Character> set=new LinkedHashSet<>();

		for(int i=0;i<str.length();i++) {
			System.out.print(s.charAt(i)+"==="+(i+1) );
			set.add(str.charAt(i));
		}
		//if we write sop here it will remove duplicates and give only one output
		System.out.println(set);
	}
}

