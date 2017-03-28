/**
 * Created by hyh on 2017/3/28.
 */
public class MoreThanHalfNum {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0 || array == null)
            return 0;
        int repeatNum = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++){
            if(count==0){
                repeatNum = array[i];
                count=1;
            }
            else if(repeatNum == array[i])
                    count++;
            else
                    count--;

        }
        int times=0;
        for(int j=0;j<array.length;j++){
            if(repeatNum == array[j])
                times++;
        }
        if(times*2 >array.length)
            return repeatNum;
        else
            return 0;


    }
    public  static  void main(String[] args){
        int[] a = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
