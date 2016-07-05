import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = in.nextLine();

		System.out.println("Enter text:");
		String text = in.nextLine();

		String[] textsplit = text.split("\\.");

		for (int i = 0; i < textsplit.length; i++) {
			if (textsplit[i].contains(word)) {
				System.out.print(textsplit[i] + ".");
			}
		}
		in.close();

	}

}