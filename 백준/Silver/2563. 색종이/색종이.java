import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean[][] sq = new boolean[100][100];
    
    int num = Integer.parseInt(br.readLine());
    int x=0, y=0, sum=0;

    for(int i=0; i<num; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        for(int j=x; j<x+10; j++){
            for(int k=y; k<y+10; k++){
                if(!sq[j][k]){//흰 부분
                    sq[j][k] = true;//검은 부분
                    sum++;
                }
            }
        }
    }
    System.out.println(sum);
    br.close();
    }
}