package JavaArrayPrograms;

public class AddingTwoarraywithdifferentlength {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		int[]b= {5,6,7,8,9,12,15,15};

		int count=b.length;
		for(int i=0;i<count;i++) {

			try {
				System.out.print(a[i]+b[i]+ " ");
			}

			catch (Exception e){

				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else
					System.out.println(b[i]);


			}

		}
	}
}

