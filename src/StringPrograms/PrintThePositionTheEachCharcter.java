package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintThePositionTheEachCharcter {
	public static void main(String[] args) {
		
		String s="Wellcome";

		LinkedHashSet<Character> set=new LinkedHashSet<>();

		for(int i=0;i<s.length();i++) {
		//	System.out.println(s.charAt(i)+" "+i);//here it will print all the duplicate letters also
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==character) {
					System.out.println(character+" "+i);// here it will print each and every character position
					break;
				}
			}

		} 

	}
}
