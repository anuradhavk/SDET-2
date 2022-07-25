package Assignments;

import java.util.LinkedHashSet;

public class PrintPositionOfVowels {
	public static void main(String[] args) {
		
		String s="india";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				set.add(s.charAt(i));
			}
			for (Character ch : set) {
				
				for(int i1=0;i1<s.length();i1++) {
					if(ch==s.charAt(i)) {
						
						System.out.println(ch+" "+(i+1));
						break;
						
					}
					
					
				}
								
			}
			
		}
	}

}
