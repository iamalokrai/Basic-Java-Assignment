import java.util.Scanner;

public class Result {

	public static void calculateResult(int[] marks) {

		int i, counter60 = 0;

		for (i = 0; i < 3; i++) {
			if (marks[i] > 60)
				counter60++;

		}

		if (counter60 == 1)
			System.out.println("Fail!!!");
		else if (counter60 == 2)
			System.out.println("Promoted!!!");
		else if (counter60 == 3)
			System.out.println("Pass!!!");

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int marks[] = new int[3];
		int i;

		System.out.println("Enter the marks of three subjects \n");

		for (i = 0; i < 3; i++)
			marks[i] = sc.nextInt();

		calculateResult(marks);

		sc.close();

	}
}