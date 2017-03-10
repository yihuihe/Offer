/**
 * Created by hyh on 2017/3/10.
 */
public class QuickSort {

    public static  void qSort(int[] data , int i, int j){
        int start = i,end = j;
        if(data.length == 0 || data == null || start<0 || end>=data.length || start>end)
            return  ;
        int key = data[start];
        while (start<end){
            while (start<end && data[end]>=key) end--;
            if(start<end){
                data[start] = data[end];
            }
            while (start<end && data[start]<=key) start++;
            if(start<end) {
                data[end] = data[start];
            }
            data[start] = key;

            qSort(data,i,start-1);
            qSort(data,end+1,j);
        }
    }

    public static void main(String[] args){
        int[] temp = new int[]{7,6,5,4,3};
        int[] result = new int[]{};
        qSort(temp,0,4);
        for(int i=0;i<temp.length;i++)
            System.out.print(temp[i]+ " ");
    }
}
