package StringPrograms;

public class PallendromeProgram {
	public static void main(String[] args) {
		
		String s="GaGaG";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			
			s1=s1+s.charAt(i);

		}
		if(s.equals(s1)) {
			System.out.println("It is a pallendrome");
			
		}else {
			System.out.println("It is not a pallendrome");
		}
			
	}

}
