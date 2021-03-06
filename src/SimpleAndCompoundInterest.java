import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleInterest SI = new SimpleInterest();
		CompoundInterest CI = new CompoundInterest();
		double principle;
		int rate, time;

		System.out.println("Enter the principle amount:");
		principle = sc.nextDouble();
		System.out.println("Enter the rate:");
		rate = sc.nextInt();
		System.out.println("Enter the time:");
		time = sc.nextInt();

		SI.setPrinciple(principle);
		CI.setPrinciple(principle);
		SI.setRate(rate);
		CI.setRate(rate);
		SI.setTime(time);
		CI.setTime(time);

		System.out.println(SI);
		System.out.println(SI.calculateSimpleInterest(principle, rate, time));
		System.out.println(CI);
		System.out.println(CI.calculateCompoundInterest(principle, rate, time));
		sc.close();

	}

}
