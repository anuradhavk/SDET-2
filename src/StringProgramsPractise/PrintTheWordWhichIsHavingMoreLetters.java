package StringProgramsPractise;

public class PrintTheWordWhichIsHavingMoreLetters {
	public static void main(String[] args) {

		String[] s= {"a","ab","Hello","Welcome","Hi"};
		String maxLength=s[0];
		System.out.println(maxLength);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			/*if(maxLength.length()<s[i].length()) {//it will print maximum length word
				maxLength=s[i];
			}*/
			
			if(maxLength.length()>s[i].length()) {  //it will print minimum length word
				maxLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(maxLength.length()==s[i].length()) { 
				System.out.println(s[i]);
			}
		}
	}

}
