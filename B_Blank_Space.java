import java.util.*;

public class B_Blank_Space {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int max = 0;
            int length = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                    length++;
                }
                else if(arr[i] == 1){
                    length = 0;
                }
                max = Math.max(max,length);
            }
            System.out.println(max);
        }
    }
}