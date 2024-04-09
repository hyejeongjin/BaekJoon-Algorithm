import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine(), " ");
    int[] a = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    st = new StringTokenizer(br.readLine(), " ");
    int[] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    st = new StringTokenizer(br.readLine(), " ");
    int[] c = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
    int x = 0;
    int y = 0;
   
    //x좌표 비교
    if(a[0] == b[0]){
        x = c[0];
    }else if(a[0] == c[0]){
        x = b[0];
    }else{
        x = a[0];
    }

    //y좌표 비교
    if(a[1] == b[1]){
        y = c[1];
    }else if(a[1] == c[1]){
        y = b[1];
    }else{
        y = a[1];
    }
    System.out.println(x + " " + y);
    br.close();
    }
}
