import java.util.Scanner;

public class Main{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int sum = 0;

    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    a[2] = sc.nextInt();

    if(a[0] >= a[1]+a[2]){
        a[0] = a[1]+a[2]-1;
    }
    if(a[1] >= a[0]+a[2]){
        a[1] = a[0]+a[2]-1;
    }
    if(a[2] >= a[0]+a[1]){
        a[2] = a[0]+a[1]-1;
    }
    sum = a[0]+a[1]+a[2];
    System.out.println(sum);
    sc.close();
    }
}