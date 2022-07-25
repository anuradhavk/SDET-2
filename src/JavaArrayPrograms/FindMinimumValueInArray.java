package JavaArrayPrograms;

public class FindMinimumValueInArray {
	
	public static void main(String[] args) {
		
		int []a= {3,6,9,12,15};
		 int mim=a[0];
		  
		 for(int i=1;i<a.length;i++) {
			 
			 if(a[i]<mim) {
				 mim=a[i];
			 }
		 }
		 System.out.println(mim);
	}

}
