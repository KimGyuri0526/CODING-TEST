import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[30];
		
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine()) - 1] = true;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) sb.append((i + 1) + " ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}