import java.util.*;

public class 2218B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            solve(sc);
        }
    }

    static int solve(Scanner sc) {

        for(int i=0;i<7;i++){
            int sum = 0;
            for(int j=0;j<7;j++){
                if(j == i){
                    continue;
                }
                sum += j;
            }
        }
    }
}