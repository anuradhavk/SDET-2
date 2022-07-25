package StringPrograms;

import java.util.LinkedHashSet;

public class PrintTheDuplicate {
public static void main(String[] args) {
		
		String s="Indira";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}

		System.out.println(set);
		for (Character ch1 : set) {
			System.out.println(ch1);
			
			int count=0;
			for(int i=0;i<s.length();i++) {
				System.out.print(s.charAt(i));
				if(ch1==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch1);
			}
			System.out.println(ch1+" "+count);
		}
	}

}
