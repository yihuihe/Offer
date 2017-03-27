import java.util.ArrayList;

/**
 * Created by hyh on 2017/3/27.
 */
public class JumpFloorII {
    public static  int JumpFloorII(int target) {
        if(target<=0)
            return 0;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        int n1 =2;
        int n0 =1;
        int count=2;
        int sum =0;
        int result =0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        while(count!=target){
            result = n1+n0;
            n0 = n1;
            for(int i=0;i<list.size();i++){
                sum += list.get(i);
            }
            n1 = sum+1;
            list.add(n1);
            count++;
            sum=0;
        }

        return list.get(list.size()-1);
    }
    public static  void  main(String[] args){
        System.out.print(JumpFloorII(4));
    }
}
