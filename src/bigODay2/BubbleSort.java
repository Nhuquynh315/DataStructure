package bigODay2;

public class BubbleSort {

	public static void main(String[] args) {
//		int[] arr = { 5, 4, 3, 2, 1 };
//		for (int v : arr) {
//			System.out.print(v + "  ");

		int[] array = { 15, 8, 10, 2, 5 };
		selectionSort(array);
		for (int a : array) {
			System.out.println(a);
		}
	}
//	}

//	public static void bubbleSort(int[] arr) {
//		for (int j = 0; j < arr.length - 1; j++) {
//			for (int i = 0; i < arr.length - 1 - j; i++) {
//				if (arr[i] > arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
//	}
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
