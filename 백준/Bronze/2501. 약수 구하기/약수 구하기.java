import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    List<Integer> num = new ArrayList<Integer>();

    for(int i=1; i<=N; i++){
        if(N % i == 0){
            num.add(i);
        }
    }
    num.sort(Comparator.naturalOrder());
    if(num.size() < K){
        System.out.println(0);
    }
    else{
        System.out.println(num.get(K-1));
    }
    br.close();
    }
}
