import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			
			for (int b = j, c = i; b >= c; b--, c++) {
				int tmp = arr[c];
				arr[c] = arr[b];
				arr[b] = tmp;
			}
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			sb.append(i + " ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}