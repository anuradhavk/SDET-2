package JavaArrayPrograms;

public class FindSecondMaximumNumber {
	
	public static void main(String[] args) {
		
		int []a= {2,4,6,8,10};
		
		for(int j=1;j<a.length;j++) {
			
			for(int i=1;i<a.length;i++) {
				
				if(a[i-1]>a[i]) {
					
					int temp=a[i-1];
					a[i-1]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]+"");
		}
		System.out.println("First maximum number"+" "+a[a.length-1] );
		
		System.out.println("First minimum number"+" "+a[0]);
		
		System.out.println("Second maximum number"+" "+a[a.length-2]);
		
		System.out.println("Second minium number"+" "+a[1]);
	}


}
