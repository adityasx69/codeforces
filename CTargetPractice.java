import java.util.Scanner;

public class CTargetPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int points = 0;
            for(int i=0;i<10;i++){
                String s = sc.next();
                for(int j=0;j<10;j++){
                    char c = s.charAt(j);
                    if(c == 'X'){
                        int layer = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        points += layer + 1;
                    }
                }
            }
            System.out.println(points);
        }
        sc.close();
    }
}