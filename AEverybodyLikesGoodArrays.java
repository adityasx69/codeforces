import java.util.Scanner;

public class AEverybodyLikesGoodArrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = scanner.nextInt();
                }
                int count = 0;
                for(int i=0;i<n-1;i++){
                    if(arr[i]%2 == arr[i+1]%2){
                        count++;
                    }
                }
                System.out.println(count);
        }
        scanner.close();
    }
}