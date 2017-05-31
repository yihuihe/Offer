import java.util.ArrayList;

/**
 * Created by hyh on 2017/4/5.
 */
public class GetLeastNumbers {
    public static int Partition(int [] input,int ii, int jj){
        if(input == null || input.length<=0 )
            return -1;
        int temp = 0;
        int start = ii;
        int end  = jj;
        int base = input[start];
        while(start<end){
            while(start<end && input[end]>=base) end--;
            input[start] = input[end];
            while(start<end && input[start]<base) start++;
            input[end] = input[start];

        }
        input[start] = base;
        return start;
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || input.length<=0 || k>input.length || k<=0)
            return list;
        int start = 0;
        int end = input.length -1;
        int index = Partition(input,start,end);
        while(index != k-1){
            if(index > k-1){
                end = index - 1;
                index = Partition(input,start,end);
            }
            else{
                start = index + 1;
                index = Partition(input,start,end);
            }
        }
        for(int i=0;i<k;i++)
            list.add(input[i]);
        return list;

    }
    public  static void  main (String[] args){
        int[] nums = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = new ArrayList<>();
        list = GetLeastNumbers_Solution(nums,1);
        for (Integer i : list)
            System.out.print(i + " ");
        System.out.println();

    }
}
