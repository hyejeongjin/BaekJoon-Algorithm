import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
   
    int N = Integer.parseInt(br.readLine());
    //수의 범위가 1~10000
    int[] range = new int[10001];
    
    //해당 값을 인덱스로 하는 배열 값 증가
    for(int i=0; i<N; i++){
        range[Integer.parseInt(br.readLine())]++;
    }

    for(int i = 1; i < 10001; i++){
        // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
        while(range[i] > 0){
            sb.append(i).append('\n');
            range[i]--;
        }
    }
    System.out.println(sb);
    br.close();
    }
}
