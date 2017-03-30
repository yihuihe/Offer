/**
 * Created by hyh on 2017/3/30.
 */
public class GetNumberOfK {
    public static int GetFirst(int[] array1, int start, int end, int k){
        if(array1 == null || array1.length == 0 || start > end)
            return -1;
        int low = start;
        int hi = end;
        int result = 0;
        int mid = (low + hi) / 2;
        if(array1[mid] ==k ){
            if(mid == 0 || (array1[mid-1] != k && mid>0))
                return mid;
            else
                end = mid -1;

        }
        else if(array1[mid]>k)
            end = mid -1 ;
        else
            start = mid +1;

        return GetFirst(array1,start,end,k);
    }

    public static int GetLast(int[] array2, int start, int end, int k){
        if(array2.length==0 || array2 == null || start > end)
            return -1;
        int low = start;
        int hi =end;
        int mid = (low + hi)/2;
        if(array2[mid] == k){
            if(mid == array2.length-1  || (mid<array2.length-1  && array2[mid+1] !=k))
                return mid;
            else
                start = mid +1;
        }
        else if(array2[mid] > k)
            end = mid - 1;
        else
            start = mid +1;
        return GetLast(array2,start,end,k);

    }
    public static int GetNumberOfK_Solution(int [] array , int k) {
        if(array.length == 0 || array == null)
            return 0;
        int start = 0;
        int end = array.length-1;

        int result1 = GetFirst(array,start,end,k);
        int result2 = GetLast(array,start,end,k);

        if(result1 != -1 && result2 != -1)
            return (result2 - result1)+1;
        else
            return 0;
    }
    public  static  void  main(String[] args){
        int[] num = {3,3,3,3,4,5};
        System.out.print(GetNumberOfK_Solution(num,3));
    }
}
