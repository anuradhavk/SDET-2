package Assignments;

public class PrintTheSentenceWithoutSpace {
	
	public static void main(String[] args) {
		
		String s="my name is indira";
		
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}

}
