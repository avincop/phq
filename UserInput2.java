import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		//System.out.println("A");
		String st = "";
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {

			st = sc.nextLine();
			if ((st.length() >= 5 && st.length() <= 10) && (st.matches(".*[A-Za-z].*")) && (st.matches(".*[0-9].*"))
					&& (st.matches(".*[@#*].*")) && (!st.contains(" "))) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}

		}
		//System.out.println("C");
		sc.close();

	}

}
