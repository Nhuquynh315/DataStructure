package bigODay2;

public class RomanToInt {

	public static int RomanToInteger(String string) {
		RomanToInt roman = new RomanToInt();
		String input = "MCMXCIII";
		System.out.println("Result of this roman number is: " + RomanToInteger("MCMXCIII"));

		int result = 0, previous = 0, current = 0;
		for (int i = string.length() - 1; i >= 0; i--) {
			switch (string.charAt(i)) {
			case 'M' -> current = 1000;
			case 'D' -> current = 500;
			case 'C' -> current = 100;
			case 'L' -> current = 50;
			case 'X' -> current = 10;
			case 'V' -> current = 5;
			case 'I' -> current = 1;
			
			}
		if (current > previous) {
			result = current - previous;
		}if (current <= previous){
			result = current + previous;
		}current = previous;
		return result;
		}
		return current;
		
		
	}

}
