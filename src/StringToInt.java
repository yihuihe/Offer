/**
 * Created by hyh on 2017/3/25.
 */
public class StringToInt {
    public static int StrToInt(String str) {
        if(str==null || str.equals(""))
            return 0;
        int len = str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(0) == '-' || str.charAt(0) == '+')
                continue;
            if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
                return 0;
        }
        double sum =0.0;
        int count=0;
        for(int k=len-1;k>0;k--){
            sum += (str.charAt(k)-'0') * Math.pow(10.0,count++);
        }
        if(str.charAt(0)=='+')
            return (int)sum;
        if(str.charAt(0)=='-')
            return (int)-sum;
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            sum += (str.charAt(0)-'0') * Math.pow(10.0,count++);

        }
        return (int)sum;
    }
    public  static  void main(String[] args){
        System.out.print(StrToInt("-2147483648"));
    }
}
