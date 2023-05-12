package bigODay2;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 3;
		System.out.println("Fibonacci value of " + num + " is: " + fibo(num));
		System.out.println("Linear time complexity is: On");

	}

	public static int fibo(int num) {

		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		int pre = 0, sum = 0, current = 2;
		for (int i = 2; i <= num; i++) {
			sum = current + pre;
			pre = current;
			current = sum;
		}
		return sum;

	}
}
