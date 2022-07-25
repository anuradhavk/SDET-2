package JavaArrayPrograms;

public class BooblesortInaccendingorder {

	public static void main(String[] args) {

		int []arr= {98,78,50,20,5};

		for(int j=1; j<arr.length;j++) {

			for(int i=1;i<arr.length;i++){

				if(arr[i-1]>arr[i]) {

					int tep=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=tep;
				}

			}
		}
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
		}

	}

}
