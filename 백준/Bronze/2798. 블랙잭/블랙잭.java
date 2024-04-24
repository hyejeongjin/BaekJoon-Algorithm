import java.util.Scanner;

public class Main{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] list = new int[N];
    int sum = 0;
    int check = 0;

    for(int i=0; i<N; i++){
        list[i] = sc.nextInt();
    }

    for(int i=0; i<N-2; i++){
        for(int j=1+i; j<N-1; j++){
            for(int k=1+j; k<N; k++){
                sum = list[i] + list[j] + list[k];
                if(check < sum && sum <= M){
                    check = sum;
                }
            }
        }
    }
    System.out.println(check);
    sc.close();
    }
}