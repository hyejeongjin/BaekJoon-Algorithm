import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //바구니 총 개수
        int N = sc.nextInt();

        //공을 바꾸는 횟수
        int M = sc.nextInt();

        int[] num = new int[N];

        //바구니에 공이 1개씩 들어있음
        for(int t=0; t<num.length; t++){
            num[t] = t+1;
        }

        //M개의 줄에 걸쳐 교환할 방법
        for(int i=0; i<M; i++){

            //i번 바구니와 j번 바구니
            int I = sc.nextInt();
            int J = sc.nextInt();

            //temp는 변수값을 바꿔주기 위해 사용하는 변수
            //바구니의 공 교환
            //인덱스는 0부터이므로 -1
            int temp = num[I-1];
            num[I-1] = num[J-1];
            num[J-1] = temp;
            
        }
        for(int k=0; k<num.length; k++){
            System.out.print(num[k] + " ");
        }
        sc.close();
    }
}