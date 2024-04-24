import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] list = new int[N];
    int sum = 0;
    int check = 0;

    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
        list[i] = Integer.parseInt(st.nextToken());
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
    br.close();
    }
}