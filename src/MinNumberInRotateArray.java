/**
 * Created by hyh on 2017/4/4.
 */
 class FindMin {
    public  int findMin(int[] array,int begin,int end){
        int i=0;
        int result = array[begin];
        for(i=begin+1;i<=end;i++){
            if(result>array[i])
                result = array[i];
        }
        return result;
    }
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0 || array == null)
            return 0;

        int begin = 0;
        int end = array.length-1;
        int mid = begin;

        while(array[begin] >= array[end]){
            if((end - begin)==1){
                mid = end;
                break;
            }
            mid = (begin + end)/2;
            if(array[mid] >=array[begin])
                begin = mid;
            if(array[mid] <= array[end])
                end = mid;
            if(array[begin] == array[end] && array[mid] == array[end])
                return findMin(array,begin,end);
        }
        return array[mid];
    }
}
public class MinNumberInRotateArray {
     public static void main(String[] args){
         int[] array = {3,4,5,1,2};
         FindMin find = new FindMin();
         System.out.println(find.minNumberInRotateArray(array));
     }

}
