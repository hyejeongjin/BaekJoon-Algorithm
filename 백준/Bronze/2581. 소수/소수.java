import java.util.Scanner;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[] num = new int[N+1];
    int[] sosu = new int[N+1];
    int sum = 0;
    int min = N;

    for(int i=M; i<=N; i++){
        num[i] += i;
        for(int j=2; j<=N; j++){
            if(j == num[i]){
                sosu[j] += j;
                min = Math.min(sosu[j], min);
                sum += sosu[j];
            }
            if(num[i] % j == 0){
                break;
            }
        }
    }
    if(sum == 0){
        System.out.println(-1);
    }else{
        System.out.println(sum + "\n" + min);
        
    }
    sc.close();
    }
}
