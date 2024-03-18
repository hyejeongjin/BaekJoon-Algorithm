import java.util.Scanner;
public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    boolean[][] sq = new boolean[100][100];
    
    int num = sc.nextInt();
    int x=0, y=0, sum=0;

    for(int i=0; i<num; i++){
        x = sc.nextInt();
        y = sc.nextInt();

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
    sc.close();
    }
}