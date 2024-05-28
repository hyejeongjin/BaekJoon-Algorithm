import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] list = new int[N];

    for(int i=0; i<N; i++){
        list[i] = Integer.parseInt(br.readLine());
    }
    for(int j=0; j<N; j++){
        Arrays.sort(list);
        System.out.println(list[j]);
    }
    br.close();
    }
}
