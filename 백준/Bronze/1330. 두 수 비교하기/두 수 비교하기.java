import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //한 줄에 공백 차이로 받으면 에러가 난다.
        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        

        if(a > b){
            System.out.println(">");
        }
        else if(a < b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}