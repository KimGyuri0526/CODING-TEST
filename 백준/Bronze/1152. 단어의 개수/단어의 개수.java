import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		br.close();
		
		String[] arr = str.split(" ");
		int len = (arr[0] == "") ? 0 : arr.length;
		
		System.out.println(len);
		
	}
}