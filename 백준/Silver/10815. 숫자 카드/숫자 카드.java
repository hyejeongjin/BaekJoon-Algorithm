import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    HashMap <Integer,Integer> map = new HashMap<Integer, Integer>();

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
        map.put(Integer.parseInt(st.nextToken()), 0);
    }

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<M; i++){
        if(map.get(Integer.parseInt(st.nextToken())) != null){
           sb.append(1 + " ");
        }else{
            sb.append(0 + " ");
        }
    }

    System.out.print(sb);
}
}