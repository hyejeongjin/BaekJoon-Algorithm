import java.util.Scanner;

public class Main{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    System.out.println(n*(n-1)*(n-2)/(3*2));
    System.out.println(3);
    sc.close();
    }
}