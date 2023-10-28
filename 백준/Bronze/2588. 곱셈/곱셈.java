import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] result = new int[3];
        
        for (int i = 0; i < 3; i++) {
            result[i] = n1 * (n2 % 10);
            System.out.println(n1 * (n2 % 10));
            n2 /= 10;
        }
        System.out.println(result[0] + result[1] * 10 + result[2] * 100);
        
        sc.close();
        
    }
}