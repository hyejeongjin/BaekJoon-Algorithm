import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[][] mem = new String[N][2];

    for(int i=0; i<N; i++){
        mem[i][0] = sc.next();
        mem[i][1] = sc.next();
    }

    Arrays.sort(mem, new Comparator<String[]>() {
        @Override
        public int compare(String[]age1, String[]age2){
            return Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]);
        }
    });

    for(int i=0; i<N; i++){
        System.out.print(mem[i][0] + " ");
        System.out.println(mem[i][1]);
    }
    sc.close();
}
}