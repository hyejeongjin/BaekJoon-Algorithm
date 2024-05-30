import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    Integer[] listArr = new Integer[N];
    
    st = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N; i++){
        listArr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(listArr, Collections.reverseOrder());
    System.out.println(listArr[k-1]);
    br.close();
    }
}
