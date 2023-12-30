import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		br.close();
		
        for (int i = 1; i <= n; i++) {
			sb.append(" ".repeat(n - i));
			sb.append("*".repeat(i * 2 - 1));
			sb.append("\n");
		}
		
        for (int i = n - 1; i > 0; i--) {
			sb.append(" ".repeat(n - i));
			sb.append("*".repeat(i * 2 - 1));
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}