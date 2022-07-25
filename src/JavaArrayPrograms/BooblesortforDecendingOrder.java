package JavaArrayPrograms;

public class BooblesortforDecendingOrder {

	public static void main(String[] args) {

		int []arr= {8,78,98,78,20};

		for(int j=1;j<arr.length;j++) {

			for (int i=1;i<arr.length;i++) {

				if(arr[i-1]<arr[i]) {

					int tep=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=tep;
				}

			}
		}

		for(int i=0;i<arr.length;i++) {

			System.out.println(arr[i]);
		}
	}

}
