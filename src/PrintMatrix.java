import java.util.ArrayList;

/**
 * Created by hyh on 2017/3/29.
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null)
            return list;
        if(matrix.length==1 && matrix[0].length==1){
            list.add(matrix[0][0]);
            return (list);
        }

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length-1;
        int i=0,j=0;
        while(rowBegin != rowEnd && columnBegin != columnEnd){
            i = rowBegin;
            j = columnBegin;
            while(j<=columnEnd){
                list.add(matrix[i][j]);
                j++;
            }
            j--;
            rowBegin++;
            i=rowBegin;
            if(rowBegin == rowEnd)
                continue;
            while(i<=rowEnd){
                list.add(matrix[i][j]);
                i++;
            }
            i--;
            columnEnd--;
            j=columnEnd;
            if(columnBegin == columnEnd)
                continue;
            while(j>=columnBegin){
                list.add(matrix[i][j]);
                j--;
            }
            j++;
            rowEnd--;
            i=rowEnd;
            if(rowBegin == rowEnd)
                continue;
            while(i>=rowBegin){
                list.add(matrix[i][j]);
                i--;
            }
            i++;
            columnBegin++;

        }
        if(rowBegin == rowEnd){
            if(j==columnEnd) {
                while (j >= columnBegin) {
                    list.add(matrix[i][j]);
                    j--;
                }
            }
            else{
                while (j <= columnEnd) {
                    list.add(matrix[i][j]);
                    j++;
                }
            }
        }
        if(columnBegin == columnEnd){
            if(i==rowEnd) {
                while (i >= rowBegin) {
                    list.add(matrix[i][j]);
                    i--;
                }
            }
            else {
                while (i <= rowEnd) {
                    list.add(matrix[i][j]);
                    i++;
                }
            }
        }
        return list;
    }
    public static void main (String[] args){
        int[][] matrix = {{1,2},{3,4}};
        ArrayList<Integer> list = new ArrayList<>();
        list = printMatrix(matrix);
    }
}
