package Assignments;

import java.util.LinkedHashSet;

public class PrintCountOfVowel 
{

	public static void main(String[] args) 
	{
		
		String s="india";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				set.add(s.charAt(i));
			}
			
		}
			for (Character ch : set) {
				int count=0;
				for(int i=0;i<s.length();i++) {
					if(ch==s.charAt(i)) {
						
						count++;
						
						
					}
					
	}
				System.out.println(ch+" "+count);
			}
}
}