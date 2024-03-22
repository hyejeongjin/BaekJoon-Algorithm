import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    int room = 1;
    int inc = 2;

    if(N == 1){
        System.out.println(room);
    }else{
        while(inc <= N){
            inc = inc + (6 * room);
            room++;
        }
        System.out.println(room);
    }
    sc.close();
    }
}