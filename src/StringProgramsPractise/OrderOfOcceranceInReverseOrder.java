package StringProgramsPractise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OrderOfOcceranceInReverseOrder {

	public static void main(String[] args) {
		
		String str="Tester";
		String s=str.toLowerCase();
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=s.length()-1;i>=0;i--) {
			set.add(s.charAt(i));
			
		}
		for (Character character : set) {
			
			for(int i=s.length()-1;i>=0;i--) {
				if(character==s.charAt(i)) {
					
					System.out.println(character+"="+(i+1));
					break;
				}
			}
		}
	}
}
