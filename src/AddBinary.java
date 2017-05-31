/**
 * Created by hyh on 2017/5/31.
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        if(a == null)
            return b;
        else if(b == null)
            return a;
        int cin = 0;
        int i=a.length()-1;
        int j=b.length()-1;
        int aa=0;
        int bb=0;
        int sum =0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0){
            aa = Integer.parseInt((a.charAt(i)-'0')+"");
            bb = Integer.parseInt((b.charAt(j)-'0')+"");
            sum = aa + bb + cin;
            if(sum>=2){
                cin = sum/2;
            }
            else
                cin = 0;
            sb.append(String.valueOf(sum%2));
            i--;
            j--;
        }
        if(i>=0){
            while(i>=0){
                aa = Integer.parseInt((a.charAt(i)-'0')+"");
                sum = aa + cin;
                if(sum >=2){
                    cin = sum /2;
                }
                else
                    cin = 0;
                sb.append(String.valueOf(sum %2));
                i--;
            }
        }
        if(j>=0){
            while(j>=0){
                bb = Integer.parseInt((b.charAt(j)-'0')+"");
                sum = bb+cin;
                if(sum >=2){
                    cin = sum /2;
                }
                else
                    cin = 0;
                sb.append(String.valueOf(sum %2));
                j--;
            }
        }
        if(cin!=0){
            sb.append(String.valueOf(cin));
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.print(addBinary("111","11"));
    }
}
