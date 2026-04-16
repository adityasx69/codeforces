import java.util.*;

public class A_One_and_Two {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            //start
            int totalTwo = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 2) totalTwo++;
            }

            int leftTwo = 0;
            int found = 0;
            for(int k=0;k<n-1;k++){
                if(arr[k] == 2) leftTwo++;

                int rightTwo = totalTwo-leftTwo;
                if(leftTwo == rightTwo){
                    System.out.println(k+1);
                    found = 1;
                    break;
                }
            }
            if(found == 0){
                System.out.println(-1);
            }
        }
    }
}