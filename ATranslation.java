import java.util.*;

public class ATranslation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = sc.nextLine();
        if(input.length()!=output.length()){
            System.out.println("NO");
        }
        else{
            int found = 1;
            int x = output.length()-1;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i) != output.charAt(x)){
                    found = 0;
                    break;
                }
                x--;
            }
            if(found==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}