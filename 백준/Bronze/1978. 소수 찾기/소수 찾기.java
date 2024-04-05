import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int num = 0;
    int count = 0;
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
        num = Integer.parseInt(st.nextToken());
        for(int j=2; j<=num; j++){
            if(j == num){
                count++;
            }
            if(num % j == 0){
                break;
            }
        }
    }
    System.out.print(count);
    br.close();
    }
}
