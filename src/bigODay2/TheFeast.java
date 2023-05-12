package bigODay2;

public class TheFeast {

	public static void main(String[] args) {
		int money = 10, price = 2, wrap = 5;
		System.out.println("Total bars Bobby got: " + totalBar(money, price, wrap));

	}

	public static int totalBar(int money, int price, int wrap) {
		int bar, newBar = 0, wrapReturn;
		bar = money/price;
		wrapReturn = bar;

		while (wrapReturn >= wrap) {
			newBar = wrapReturn / wrap;
			bar += newBar;
			wrapReturn = newBar + wrapReturn%wrap;
		}
		return (bar);
	}
}
//Space complexity