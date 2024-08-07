import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int count = 0;

    HashMap<String, String> map = new HashMap<String, String>();

    for(int i=0; i<N; i++){
        map.put(br.readLine(), null);
    }
    for(int i=0; i<M; i++){
        if(map.containsKey(br.readLine())){
            count++;
        }
    }
    System.out.print(count);
}
}