import java.util.Scanner;

/**
 * Created by hyh on 2017/4/28.
 */
public class AverageYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String[] temp = inputStr.split(" ");
        int allPersonNum  = Integer.valueOf(temp[0]);
        double allPersonAverageAge = Integer.valueOf(temp[1]);
        double quitRate = Double.valueOf(temp[2]);
        int Year = Integer.valueOf(temp[3]);

        int AverageAgeOfNew = 21;
        while (Year>0){
            allPersonAverageAge = (1 - quitRate) * (allPersonAverageAge + 1)  + quitRate * AverageAgeOfNew;
            Year--;
        }
        //int result =  Math.ceil(allPersonAverageAge);
        System.out.println((int) Math.ceil(allPersonAverageAge));
    }
}
