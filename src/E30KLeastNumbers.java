/**
 * Created by hyh on 2017/4/5.
 */
public class E30KLeastNumbers {
    // 使用partition函数
    public int partition(int[] arr, int left, int right) {
        int result = arr[left];
        if (left > right)
            return -1;

        while (left < right) {
            while (left < right && arr[right] >= result) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] < result) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = result;
        return left;
    }
    public int[] getLeastNumbers(int[] input,int k){
        if(input.length == 0 || k<= 0)
            return null;
        int[] output = new int[k];
        int start = 0;
        int end = input.length-1;
        int index = partition(input,start,end);
        while(index != k-1){
            if(index > k-1){
                end = index -1;
                index = partition(input,start ,end);
            }
            else{
                start = index+1;
                index = partition(input,start ,end);
            }
        }
        for(int i = 0;i<k;i++){
            output[i] = input[i];
        }
        return output;
    }
    public static void main(String[] args){
        int[] arr= {4,5,1,6,2,7,3,8};
        E30KLeastNumbers test = new E30KLeastNumbers();
        int[] output=test.getLeastNumbers(arr, 1);
        for(int i = 0;i<output.length ;i++){
            System.out.print(output[i]+",");
        }
    }
}