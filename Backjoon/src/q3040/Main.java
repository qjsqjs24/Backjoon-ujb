package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] inp = new int[9];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}
//		System.out.println();

		// 1단계 ---------------------------------
		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}
//		System.out.println("sum = " + sum);

		for (int a = 0; a < inp.length; a++) {
			for (int b = 0; b < inp.length; b++) {
				if (a != b) {
					int svnSum = sum - inp[a] - inp[b];
					if (svnSum == 100) {
//						System.out.println(inp[a] + " " + inp[b] + " => " + svnSum);

						// print
						for (int i = 0; i < inp.length; i++) {
							if (i != a && i != b) {
								System.out.println(inp[i]);
							}
						}
						System.exit(0);
					}
				}
			}
		}
	}
}
