package StringPrograms;

import java.util.LinkedHashSet;

public class ConvertTheStringToArrayAndPrintOrder {

	public static void main(String[] args) {

		String st="Wellcome"; 
		char[]s=st.toCharArray();

		LinkedHashSet<Character> set=new LinkedHashSet<>();

		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+"=="+(i+1));//here it will print all the duplicate letters also
			set.add(s[i]);
		}

		for (Character character : set) {

			for(int i=0;i<s.length;i++) {
				if(s[i]==character) {
					System.out.println(character+"="+(i+1));// here it will print each and every character position
					break;
				}
			}

		} 

	}
}
