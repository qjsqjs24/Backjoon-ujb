package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer>stk = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
			switch (cmd) {
			case "push":
				int p = sc.nextInt();
				stk.push(p);
				break;
			case "top":
				if(stk.isEmpty()) {
					System.out.println("-1");
				}
				System.out.println(stk.peek());
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty" :
				if(stk.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "pop":
				if(stk.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stk.pop());
				}
				break;
			}
		}
		sc.close();
	}

}
