import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        String id, reg;

        id = sc.nextLine();

        reg = "^[a-z][^0-9]{0,50}$";

        if(id.matches(reg) == false){
            System.out.println("50자 이하의 소문자로 다시 입력하세요.");
            
            id = sc.nextLine();
        }
            System.out.println(id + "??!");
            sc.close();
    }
}