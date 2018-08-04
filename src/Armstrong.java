
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int x = num % 10;
			num = num / 10;
			sum = sum + (x * x * x);
		}
		if (temp == sum) {
			System.out.println("Armstrong Number");
		} else
			System.out.println("Not an Armstrong Number");
		sc.close();
	}
}
