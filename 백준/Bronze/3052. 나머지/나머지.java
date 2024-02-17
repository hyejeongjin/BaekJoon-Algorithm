import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer[] num = new Integer[10];
        Set<Integer> set = new HashSet<Integer>();
 
        for(int i=0; i<=9; i++){
            num[i] = sc.nextInt();
            set.add(num[i] % 42);

        }
        System.out.println(set.size());
       
        sc.close();
    }
}