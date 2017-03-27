/**
 * Created by hyh on 2017/3/27.
 */
public class FirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        int index = -1;
        int[] temp = new int[52];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                index = str.charAt(i) - 'a';
                temp[index]++;

            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                index = str.charAt(i) - 'A';
                temp[index+26]++;
            }
        }
        int result = -1;
        for(int k=0;k<str.length();k++){
            if(str.charAt(k)>='a' && str.charAt(k)<='z')
            {
                index = str.charAt(k) - 'a';
                if(temp[index]==1){
                    result =k;
                    break;
                }
            }
            if(str.charAt(k)>='A' && str.charAt(k)<='Z')
            {
                index = str.charAt(k) - 'A';
                if(temp[index+26]==1){
                    result =k;
                    break;
                }
            }

        }


        return result;
    }
    public  static  void  main(String[] args){
        System.out.print(FirstNotRepeatingChar("DAJdafhDJAKFHEFCe"));
    }

}
