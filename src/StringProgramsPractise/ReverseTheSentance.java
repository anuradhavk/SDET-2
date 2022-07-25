package StringProgramsPractise;

import java.util.LinkedHashSet;

public class ReverseTheSentance {

	public static void main(String[] args) {

		String st="Hi Hello Welcome Bye";
		String[] s = st.split(" ");//if we remove the space it will reverse all the words and give output
		//This is for loop Reversing the Sentance
		/*for(int i=s.length-1;i>=0;i--) {
		//	System.out.print(s[i]);//it will remove space and give out put
		System.out.print(s[i]+" ");//it will print the space in the output*/

		//This for loop is revesing Each letter
	//	for(int i=0;i<s.length;i++) {
		for(int i=s.length-1;i>=0;i--) {
			String st1=s[i];
			for(int j=st1.length()-1;j>=0;j--) {
				System.out.print(st1.charAt(j));
			}
			System.out.print(" ");


		//}
	}

	}
}

