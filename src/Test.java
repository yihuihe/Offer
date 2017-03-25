import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by hyh on 2017/3/25.
 */
public class Test {
    public  static  void  main(String[] args){
        Set<String> set = new HashSet<>();
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        String str = s2.nextLine();
        String[] str1 = str.split(" ");
        for(int i=0;i<num;i++){
            if(set.size()==0)
                set.add(str1[i]);
            else {
                for(String temp : set){
                    if(!temp.equals(str1[i]))
                        set.add(str1[i]);
                }
            }
        }
        for(String s : set)
            System.out.print(s+" ");

    }
}
