import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int xmax = -10000;
    int xmin = 10000;
    int ymax = -10000;
    int ymin = 10000;

    for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        xmax = Math.max(xmax, x);
        xmin = Math.min(xmin, x);
        ymax = Math.max(ymax, y);
        ymin = Math.min(ymin, y);
    }
    System.out.println((xmax-xmin)*(ymax-ymin));
    br.close();
    }
}
