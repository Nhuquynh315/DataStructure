package bigODay2;

public class SearchNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 7, 8, 12, 23, 44, 57, 88, 104 };
		int index = searchNumber(44, arr);

		System.out.println(index);

	}

	public static int searchNumber(int number, int[] arr) {
		// return index of the number
		int beginIndex = 0;
		int endIndex = arr.length - 1;
		int mid = (beginIndex + endIndex) / 2;
		int countOperation = 0;
		while (beginIndex <= endIndex) {
			countOperation++;
			if (arr[mid] == number) {
				return mid;
			}
			if (number < arr[mid]) {
				endIndex = mid - 1;
			} else if (number > arr[mid]) {
				beginIndex = mid + 1;
			}
			mid = (beginIndex + endIndex) / 2;
		}
		System.out.println("Total loop = " + countOperation);
		return -1;
	}
}
