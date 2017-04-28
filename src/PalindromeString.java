import java.util.Scanner;

/**
 * Created by hyh on 2017/4/28.
 */
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int[] alphabet =new int[26];
            for(int i=0;i<str.length();i++){
                alphabet[str.charAt(i)-'a']++;
            }
            int oddSum = 0;
            for(int j=0;j<alphabet.length;j++){
                if(alphabet[j] % 2 !=0)
                    oddSum++;
            }
            if(oddSum>2)
                System.out.println("NO");
            else
                System.out.println("YES");
            oddSum = 0;

        }
        sc.close();
    }
}
