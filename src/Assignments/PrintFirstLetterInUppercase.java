package Assignments;

public class PrintFirstLetterInUppercase {
	public static void main(String[] args) {


		String s="my name is indira";

		String[] str=s.split(" ");

		for(int i=0;i<str.length;i++) {

			char firstchar = (char)(str[i].charAt(0)-32);
			String sub = str[i].substring(1);

			System.out.print(firstchar+sub+" ");

		}

	}
}