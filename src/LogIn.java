
import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: for (int i = 0; i < 3; i++) {
			System.out.println("Enter your Login Name:");
			Scanner sc = new Scanner(System.in);
			String login = sc.nextLine();
			System.out.println("Enter your Password:");
			String pass = sc.nextLine();
			if (login.equals("alorai") && pass.equals("alok123")) {
				i = 3;
				System.out.println("Welcome Alok Rai");
				break outer;
			} else {
				if (i == 2) {
					System.out.println("Contact Admin");
					break outer;
				}
				i++;
			}
			sc.close();
		}

	}

}
