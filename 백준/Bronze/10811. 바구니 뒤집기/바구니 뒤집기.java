import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //바구니 개수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N+1];

        for(int i=1; i<num.length; i++){
            num[i] = i;
        }
        
        for(int t=0; t<M; t++){
            
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());

           for(int p=I; p<=J; p++){
                int temp = num[p];
                num[p] = num[J];
                num[J--] = temp;
           }

        }

        for(int k=1; k<num.length; k++){
            System.out.print(num[k] + " ");
        }

        br.close();
    }
}