import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        
        for(int i=97; i<123; i++){
            System.out.printf("%d", S.indexOf(i));
            if(i != 122){
                System.out.print(" ");
            }
        }

        sc.close();
    }
}