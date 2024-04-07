import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

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
        System.out.println(sum);
        System.out.println(min);
    }
    br.close();
    }
}
