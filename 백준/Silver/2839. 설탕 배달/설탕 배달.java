import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		br.close();
		
		while (n > 0) {
			if (n % 5 == 0) {
				count += n / 5;
				break;
			}
			
			if (n < 3) {
				count = -1;
				break;
			}
			
			n -= 3;
			count++;
		}
		
		System.out.println(count);
		
	}
}