package StringPrograms;

public class ReverseStringByUsingToCharArray {
	
	public static void main(String[] args) {
		
		String s="Tumkur";
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
		
		
}
