import java.util.*;

public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int noOfStation = sc.nextInt();
            int length = sc.nextInt();
            int ans = 0; int prev =0;
            for(int i=0;i<noOfStation;i++){
                int x = sc.nextInt();
                ans = Math.max(ans,x-prev);
                prev = x;
            }
            ans = Math.max(ans,2*(length-prev));
            System.out.println(ans);
        }
        sc.close();
    }
}