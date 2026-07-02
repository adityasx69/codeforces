import java.util.Scanner;

public class ADonTTryToCount{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            String x = sc.next();
            String s = sc.next();

            int ans = 0;

            while (ans <= 6) {
                if (x.contains(s)) {
                    System.out.println(ans);
                    break;
                }
                x += x;
                ans++;
            }

            if (ans > 6) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}