import java.util.ArrayList;

/**
 * Created by hyh on 2017/4/5.
 */
public class FindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length <= 0)
            return list;
        int start = 0;
        int end = array.length - 1;

        while(start < end){
            if(array[start] + array[end] == sum){
                if(list.size() == 0){
                    list.add(array[start]);
                    list.add(array[end]);
                }
                else{
                    if((array[start] * array[end]) <  (list.get(0) * list.get(1)))
                    {
                        list.clear();
                        list.add(array[start]);
                        list.add(array[end]);
                    }

                }
                start++;
                end--;

            }
            else if(array[start] + array[end] > sum)
                end--;
            else
                start++;

        }
        return list;


    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        list = FindNumbersWithSum(nums,11);
        for(Integer i : list)
            System.out.println(i);
    }
}
