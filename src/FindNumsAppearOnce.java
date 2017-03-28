/**
 * Created by hyh on 2017/3/28.
 */
public class FindNumsAppearOnce {
    public static int FindNumOnce(int[] array){
        if(array.length==0 || array==null)
            return 0;
        int result = array[0];
        for(int i=1;i<array.length;i++){
            result = result ^ array[i];
        }
        return result;
    }

    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public static  void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null || array.length == 0)
            return ;
        int temp = FindNumOnce(array);
        int index =0;
        int compare = 1;
        while(compare!=0){
            if((temp & compare)!=0){
                break;
            }
            else{
                compare <<= 1;
            }
        }
        int result1= 0;
        int result2= 0;
        for(int j=0;j<array.length;j++){
            if((array[j] & compare) !=0)
                result1 = result1 ^ array[j];
            else
                result2 = result2 ^ array[j];
        }
        num1[0] = result1;
        num2[0] = result2;


    }
    public  static  void main(String[] args){
        int[] array = new int[]{2,4,3,6,3,2,5,5};
        int[] num1= new int[1];
        int[] num2= new int[1];
        FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
