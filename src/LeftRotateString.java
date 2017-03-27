/**
 * Created by hyh on 2017/3/27.
 */
public class LeftRotateString {
    public static String Swap(String s){
        if(s==null || s.equals(""))
            return null;
        if(s.length()==1)
            return s;
        char[] str1 = s.toCharArray();
        int low = 0;
        int hi = s.length()-1;
        char temp = '0';
        while(low<hi){
            temp = str1[low];
            str1[low] = str1[hi];
            str1[hi] = temp;
            low++;
            hi--;
        }
        return String.valueOf(str1);

    }
    public static String LeftRotateString(String str,int n) {
        if(str==null || str.equals(""))
            return "";
        if(n<=0)
            return str;

        int length = str.length();
        if(n>length)
            n= n % length;

        String left = Swap(str.substring(0,n));
        String right = Swap(str.substring(n,length));
        String all = left + right;
        return Swap(all);

    }
    public static void  main (String[] args){
        System.out.println(LeftRotateString("cdefgab",2));
    }
}
