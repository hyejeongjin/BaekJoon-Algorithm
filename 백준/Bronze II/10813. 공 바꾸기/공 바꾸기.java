import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
        //바구니 총 개수
        int N = Integer.parseInt(st.nextToken());

        //공을 바꾸는 횟수
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];

        //바구니에 공이 1개씩 들어있음
        for(int t=0; t<num.length; t++){
            num[t] = t+1;
        }

        //M개의 줄에 걸쳐 교환할 방법
        for(int i=0; i<M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            //i번 바구니와 j번 바구니
            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());

            //temp는 변수값을 바꿔주기 위해 사용하는 변수
            //바구니의 공 교환
            //인덱스는 0부터이므로 -1
            int temp = num[I-1];
            num[I-1] = num[J-1];
            num[J-1] = temp;
            
        }
        for(int k=0; k<num.length; k++){
            System.out.print(num[k] + " ");
        }
        br.close();
    }
}