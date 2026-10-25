import java.util.Scanner;

class maxof_n_numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many numbers? ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a positive number of values.");
			scanner.close();
			return;
		}

		System.out.print("Enter number 1: ");
		int maximum = scanner.nextInt();

		for (int i = 2; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			int number = scanner.nextInt();
			if (number > maximum) {
				maximum = number;
			}
		}

		System.out.println("Maximum: " + maximum);
		scanner.close();
	}
}
