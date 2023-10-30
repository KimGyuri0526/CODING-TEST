class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gdc = GDC(denom1, denom2);		
        int lcm = denom1 * denom2 / gdc;	
        
        int n = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
        int d = lcm;
      
        gdc = GDC(n, d);
        
        int[] answer = { n, d };	
        
        if (gdc != 1) answer[0] = n / gdc; answer[1] = d / gdc;
        return answer;
    }
    
    public static int GDC(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}