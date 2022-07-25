package JavaArrayPrograms;

public class EqualArrayLength {
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		int []b= {6,7,8,9,11,12};
		
	//	int count=b.length;
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]+b[i]);
		}
		
	}

}
