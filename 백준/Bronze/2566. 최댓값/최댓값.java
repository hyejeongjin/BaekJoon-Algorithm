import java.util.Arrays;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] A = new int[9][9];
    int max = -1;
    int x = 0;
    int y = 0;
    
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            A[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
          if(A[i][j] > max){
            max = A[i][j];
            x = i+1;
            y = j+1;
          } 
        }
    }
    System.out.println(max);
    System.out.println(x + " " + y);
    
    sc.close();
    }
}