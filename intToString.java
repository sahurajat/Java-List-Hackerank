//if we convert int to string then it print good job otherwise it return wrong answer
import java.util.Scanner;

public class intToString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		// String s=???; Complete this line below

		String s = Integer.toString(n);

		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer.");
		}

	}
}
