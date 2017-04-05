/**
 * Created by hyh on 2017/4/5.
 */
public class MoreThanHalfNumII {
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

    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length<=0 )
            return 0;
        int start = 0;
        int end = array.length -1;
        int index = Partition(array,start,end);
        int mid = (start + end)/2;
        while(index != mid){
            if(index > mid){
                end = index - 1;
                index = Partition(array,start,end);
            }
            else{
                start = index + 1;
                index = Partition(array,start,end);
            }
        }
        int result = array[index];

        int times=0;
        for(int j=0;j<array.length;j++){
            if(result == array[j])
                times++;
        }
        if(times*2 >array.length)
            return result;
        else
            return 0;
    }
    public  static void  main(String[] args){
        int[] nums = {1,2,3,8,2,2,5,4,2};
        System.out.print(MoreThanHalfNum_Solution(nums));
    }
}
