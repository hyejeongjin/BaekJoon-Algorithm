import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] a = new int[3];

    while(true){
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());
        a[2] = Integer.parseInt(st.nextToken());

        if(a[0] == 0 && a[1] == 0 && a[2] == 0){//마지막 줄
            break;
        }
        if(a[0] == a[0] && a[1] == a[2] && a[2] == a[0]){//세 변의 길이가 모두 같은 경우
            System.out.println("Equilateral");
        }else if(a[2] >= a[0]+a[1] || a[0] >= a[1]+a[2] || a[1] >= a[0]+a[2]){
            System.out.println("Invalid");
        }else if(a[0] == a[1] || a[0] == a[2] || a[1] == a[2]){//두 변의 길이만 같은 경우
            System.out.println("Isosceles");
        }else if(a[0] != a[1] && a[1] != a[2] && a[0] != a[2]){
                System.out.println("Scalene");
        }
    }
    br.close();
    }
}