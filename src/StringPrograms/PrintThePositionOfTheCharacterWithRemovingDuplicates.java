package StringPrograms;

public class PrintThePositionOfTheCharacterWithRemovingDuplicates {
	
	public static void main(String[] args) {
		
		String s="hello";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i)+" "+(i+1));
		}
	}

}
