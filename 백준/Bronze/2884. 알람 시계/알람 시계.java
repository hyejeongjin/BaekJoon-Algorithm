import java.util.*;
public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int h, m;
do{
    h = sc.nextInt();
    m = sc.nextInt();
    if(m < 45){
        m = m + 60 - 45;
        h--;
        if(h < 0){
            h = 23;
        }
        System.out.printf("%d %d", h, m);
        break;
    }else{
        m = m - 45;
        System.out.printf("%d %d", h, m);
        break;
    }
}while(h > -1 || h < 24 || m > -1 || m < 60);
     sc.close();
    }
}
