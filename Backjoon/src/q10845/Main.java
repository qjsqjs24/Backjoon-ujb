package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			System.out.println(N);
			
			for(int i=0; i<N; i++) {
				String inp = br.readLine();
				StringTokenizer st = new StringTokenizer(inp);
				String cmd = "";
				int num = 0;
				if(st.countTokens()==2) {
					cmd = st.nextToken();
					num = Integer.parseInt(st.nextToken());
				}else {
					cmd = st.nextToken();
				}
				System.out.println(cmd + " " + num);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
