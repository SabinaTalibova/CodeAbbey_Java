
//Problem Statement
// Input data contain number of test-cases in the first line.
// Then the specified number of lines follows each representing one
// test-case.
// Lines consist only of lowercase English (Latin) letters and spaces.
// Answer should contain the number of vowels in each line, separated by
// spaces
import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		int[] counts = new int[n];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			int count = 0;

			for (int j = 0; j < str.length(); j++) {

				char ch = str.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'y') {
					count++;

				}
				counts[i] = count;

			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(counts[i] + " ");
		}
	}
}
