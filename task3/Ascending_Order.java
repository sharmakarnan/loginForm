package task3;

public class Ascending_Order {

	public static void main(String[] args) {
		int arr[] = {3,1,5,4,2};
		int temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}

	}

}
