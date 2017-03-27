/**
 * Created by hyh on 2017/3/27.
 */
public class VerifySquenceOfBST {
    public static boolean Verify(int[] s,int start,int end){
        int length = s.length;
        if(length==0 || s==null)
            return false;
        int index = start;
        int root = s[end];
        int i=start;
        for( i=start;i<end;i++){
            if(s[i]>root){
                index= i;
                break;
            }
        }
        int j=i;
        for(;j<end;j++){
            if(s[j]<root)
            {
                return false;
            }
        }

        boolean left = true,right = true;
        if(index>start)
            left = Verify( s,start,index-1);
        if(index<end)
            right = Verify(s,index,end-1);

        return (left && right);
    }
    public static  boolean VerifySquenceOfBST1(int [] sequence) {
        int start = 0;
        int end = sequence.length-1;
        return Verify(sequence,start,end);

    }
    public static  void  main (String[] args){
        int[] num = new int[]{4,6,7,5};
        System.out.print(VerifySquenceOfBST1(num));
    }
}
