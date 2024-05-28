import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int bag = 0;

    while(N>0){
        if(N % 5 == 0){
            bag += N / 5;
            break;
        }else{
            N -= 3;
            bag++;
        }
        if(N<0){
            bag = -1;
            break;
        }  
    }

    System.out.println(bag);
    sc.close();

    }
}
