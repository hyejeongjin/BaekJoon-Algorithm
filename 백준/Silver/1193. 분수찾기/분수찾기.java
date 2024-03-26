import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int X = Integer.parseInt(br.readLine());
    int cross=1;//대각선
    int prev=0;//이전 대각선 합

    while (true) {
        if (X <= prev + cross) {	
            if (cross % 2 == 1) {//홀수
                System.out.print((cross - (X - prev - 1)) + "/" + (X - prev));
                break;
            } 
            else {//짝수
                System.out.print((X - prev) + "/" + (cross - (X - prev - 1)));
                break;
            }
        } else {
            prev += cross;
            cross++;
        }
    }
    }
}

