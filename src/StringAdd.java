/**
 * Created by hyh on 2017/3/20.
 */
public class StringAdd {
    public static String add(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        int max = length1 >= length2 ? length1 : length2;
        StringBuilder sb = new StringBuilder();
        int a = length1 - 1;
        int b = length2 - 1;
        int nSum = 0, cin = 0;
        boolean overFlag = false;
        while (a >= 0 && b >= 0) {
            nSum = Integer.valueOf(s1.charAt(a) + "") + Integer.valueOf(s2.charAt(b) + "") + cin;
            if (nSum >= 10) {
                nSum = nSum % 10;
                cin = nSum / 10;
            }
            sb.append(nSum);
            a--;
            b--;
        }
        if (a == -1 && b >= 0) {
            while (b >= 0) {
                nSum = Integer.valueOf(s2.charAt(b) + "") + cin;
                if (nSum >= 10) {
                    nSum = nSum % 10;
                    cin = nSum / 10;
                }
                sb.append(nSum);
                b--;
            }
        }
        if (b == -1 && a >= 0) {
            while (a >= 0) {
                nSum = Integer.valueOf(s1.charAt(a) + "") + cin;
                if (nSum >= 10) {
                    nSum = nSum % 10;
                    cin = nSum / 10;
                }
                sb.append(nSum);
                a--;
            }
        }
        if(cin == 1 )
            sb.append(cin);
        String result = sb.reverse().toString();
        return result;

    }
    public  static  void main(String[] args){
        String s1 = "1111111111111111111111111111111111111111111111111111111111111111";
        String s2 = "2";
        System.out.print(add(s1,s2));
    }

}
