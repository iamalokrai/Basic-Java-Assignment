public class ArmstrongRange {
	public static void main(String[] args) {
		int i = 100;
		while (i < 1000) {
			int a = armstrong(i);
			if (a == i)
				System.out.println(i);
			i++;
		}
	}

	static int armstrong(int num) {
		int x, y = 0;
		while (num > 0) {
			x = num % 10;
			y = y + (x * x * x);
			num = num / 10;
		}
		return y;
	}
}