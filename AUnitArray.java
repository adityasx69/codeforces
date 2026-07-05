import java.util.Scanner;

public class AUnitArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int negative = 0; int positive = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] == -1){
                    negative++;
                }
                else{
                    positive++;
                }
            }
            int sum = positive-negative; 
            int count=0;
            while(sum<0){
                positive++;
                negative--;
                count++;
                sum = positive-negative;
            }
            if(negative%2==1){
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}