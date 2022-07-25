package StringProgramsPractise;

public class PrintTheWordWhichIsHavingHighestNumber {
	public static void main(String[] args) {

		String[] a= {"1","223","4567","77895","89654"};

		String maxlgth=a[0];
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);

			/*if(maxlgth.length()<a[i].length()) {  //it will print maximum numbers
				maxlgth=a[i];*/

			if(maxlgth.length()>a[i].length()) { //it will print minimum number
				maxlgth=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(maxlgth.length()==a[i].length()) {
				System.out.println(a[i]);
			}
		}


	}

}
