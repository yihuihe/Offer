/**
 * Created by hyh on 2017/3/29.
 */
public class FindNum {
    public boolean Find(int target, int [][] array) {
        if(array == null)
            return false;
        int i = array.length-1;
        int j= 0;

        while(i>=0 && j<array[0].length){
            if(target == array[i][j])
                return true;
            else if(target > array[i][j]){
                j = j + 1;

            }
            else if (target < array[i][j]){
                i--;
            }
        }
        return false;

    }
}
