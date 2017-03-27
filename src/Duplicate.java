import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyh on 2017/3/27.
 */
public class Duplicate {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers.length<=1 || numbers==null)
            return false;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int temp = 0,temp1=0;
        for(int i=0;i<length;i++){
            temp = numbers[i];
            if(!map.containsKey(temp))
                map.put(temp,1);
            else{
                temp1 = map.get(temp);
                map.remove(temp);
                map.put(temp,temp1+1);
                //map.replace(temp,temp1+1);
            }

        }
        int result=0;
        for(Integer j : map.keySet()){
            result = map.get(j);
            if(result>1){
                duplication[0] = j;
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[] numbers = new int[]{2,3,4,5,6,7,8,4};
        int length = numbers.length;
        int[] duplication = new int[1];
        System.out.println(duplicate(numbers,length,duplication));
        System.out.print(duplication[0]);
    }
}
