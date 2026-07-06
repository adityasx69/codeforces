import java.util.Scanner;

public class AGoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n-1];
            int sum = 0;
            for(int i=0;i<n-1;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int ans = 0 - sum;
            System.out.println(ans);
        }
        sc.close();
    }
}
