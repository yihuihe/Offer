/**
 * Created by hyh on 2017/5/29.
 */
public class MaxSubArray {
    public static int maxSubArray(int[] A) {
        if(A == null || A.length<=0)
            return 0;
        if(A.length == 1)
            return A[0];
        int end=0;
        int maxSum =Integer.MIN_VALUE;
        int tempSum = 0;
        while(end<A.length){
            if(tempSum + A[end]<A[end]){
               // maxSum = A[end];
                tempSum = A[end];
            }
            else{
                if(tempSum + A[end]>maxSum)
                    maxSum = tempSum + A[end];
                tempSum = tempSum + A[end];
            }
            end++;

        }
        return maxSum;

    }
    public static void main(String[] args){
        int[] arr = {-1,-2};
        System.out.println(maxSubArray(arr));
    }
}
