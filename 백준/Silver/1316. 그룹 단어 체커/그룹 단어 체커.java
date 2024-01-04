import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;	
		
		for (int i = 0; i < n; i++) {
			boolean[] arr = new boolean[26];
			String str = br.readLine();
			arr[str.charAt(0) - 97] = true;		
            
			for (int j = 1; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (ch == str.charAt(j - 1)) continue;
				else {	
					if (arr[ch - 97]) {
						cnt--;		
						break;		
					}
					
					arr[ch - 97] = true;	
				}
			}
		}
		
		br.close();
		System.out.println(cnt);
		
	}
}