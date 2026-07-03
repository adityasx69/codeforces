import java.util.Scanner;

public class AExtremelyRound{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            int temp = n; int count=0;
            while(temp>0){
                count++;
                temp/=10;
            }
            int x = (int) Math.pow(10, count-1);
            int fDigit = n/x;

            int ans = 9*(count-1)+fDigit;
            System.out.println(ans);
        }
        scanner.close();
    }
}