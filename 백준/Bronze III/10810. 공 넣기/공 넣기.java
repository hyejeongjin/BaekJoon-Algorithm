import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //바구니 개수 및 바구니 번호, 공 번호
        int N = Integer.parseInt(st.nextToken());
        //공을 넣는 횟수
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];

        //M개의 줄에 걸쳐서 공을 넣는 방법
        for(int i=0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            //i번 바구니부터 j번 바구니까지 k번 번호가 적힌 공을 넣는다.
            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());
            int K = Integer.parseInt(st2.nextToken());

            //인덱스는 0부터 시작하므로 I - 1
            for(int j = I - 1; j < J; j++){
                //K번 번호가 적혀진 공 넣기
                num[j] = K;
            }
        }    
        for(int k = 0; k < num.length; k++){
            System.out.print(num[k] + " ");
        }
        br.close();
    }
}