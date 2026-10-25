import java.util.Scanner;

public class threenum_max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three numbers: ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();

		int max = Math.max(first, Math.max(second, third));
		System.out.println("Maximum: " + max);

		scanner.close();
	}
}
