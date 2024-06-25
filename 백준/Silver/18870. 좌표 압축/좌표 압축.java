import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] list = new int[N];
    int[] sorting = new int[N];
    HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
        list[i] = Integer.parseInt(st.nextToken());
        sorting[i] = list[i];
    }
    
    Arrays.sort(sorting);
    int rank = 0;
    for(int i : sorting){ 
        if(!map.containsKey(i)){
            map.put(i, rank);
            rank++;
        }
    }
   for(int i : list){
    int ans = map.get(i);
    sb.append(ans).append(' ');
   }
   System.out.println(sb);
    br.close();
}
}