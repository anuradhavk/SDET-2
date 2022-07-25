package Assignments;

public class SeperateNumbersandSpecialcharacters {
	public static void main(String[] args) {

		String s= "a@#$1#Bcd23*";
		String s1=" ";
		String s2=" ";
		String s3=" ";


		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				s1=s1+s.charAt(i);
			}

			else if(Character.isDigit(s.charAt(i))){
				s2=s2+s.charAt(i);
			}else {
				s3=s3+s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
