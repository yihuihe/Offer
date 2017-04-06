/**
 * Created by hyh on 2017/3/27.
 */
public class ReverseSentence {

    public static String ReverseSentence(String str) {
        if (str == null || str.equals(""))
            return "";
        if (str.matches("[ ]+"))
            return str;
        StringBuilder s = new StringBuilder();
        String[] word = str.split(" ");
        if (word.length == 1)
            return str;
        if (word.length > 1) {
            for (int i = word.length - 1; i > 0; i--) {
                s.append(word[i]);
                s.append(" ");
            }
            s.append(word[0]);
        }
        return s.toString();
    }
    /*
    public static String ReverseWord(String s){
        if(s==null || s.equals(""))
            return "";
        char[] temp = s.toCharArray();
        int low = 0;
        int hi = s.length()-1;
        char temp1= '0';
        while(low<hi){
            temp1 = temp[low];
            temp[low] = temp[hi];
            temp[hi] = temp1;
            low++;
            hi--;
        }
        return String.valueOf(temp);
    }
    public static String ReverseSentence(String str) {
        if(str == null || str.equals(""))
            return "";
        StringBuilder s = new StringBuilder();
        s.append(str);
        String temp = s.reverse().toString();

        char[] reverse = temp.toCharArray();
        StringBuilder b = new StringBuilder();
        int begin=0,end=0;
        String tempResult="";
        while(end<reverse.length){
            if(reverse[begin]==' '){
                begin++;
                end++;
                b.append(' ');
            }
            else{
                if(reverse[end]==' ' && end<reverse.length){
                    tempResult = ReverseWord(temp.substring(begin,end));
                    b.append(tempResult);
                    begin = ++end;
                }
                else
                    ++end;

            }

        }
        b.append(reverse[--end]);
        return b.toString();

    }
    */
    public  static void main (String[] args){

        System.out.println(ReverseSentence("I am student"));
    }
}
