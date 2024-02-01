import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mul = n/4;

        for(int i=0; i<mul; i++){
            System.out.printf("long ");
        }
        System.out.printf("int");

        sc.close();
    }
}
