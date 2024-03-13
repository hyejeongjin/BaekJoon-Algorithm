import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
public static void main(String[] args)throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] gradeList = {"A+", "A0", "B+", "B0","C+", "C0", "D+", "D0", "F"};
        Double[] scoreList = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        Double sum = 0.0;
        Double gradeSum = 0.0;

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();
            Double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for(int j=0; j<gradeList.length; j++){
                if(grade.equals(gradeList[j])){
                    sum += score * scoreList[j];
                    gradeSum += score;
                }
            }
        }
        System.out.println(sum/gradeSum);
    }  
}