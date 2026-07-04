import java.util.Scanner;
public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if(y2<y1){
                System.out.println("-1");
                continue;
            }
            int dMoves = y2-y1;
            x1+=dMoves;
            if(x1<x2){
                System.out.println("-1");
                continue;
            }
            int lMoves = x1-x2;
            System.out.println(dMoves+lMoves);
        }
        sc.close();
    }
}