/**
 * Created by hyh on 2017/3/2.
 */
public class ArrayFind {
    public static  boolean findNumber(int[][] data,int number){
        int cow = data.length;
        int column = data[0].length;
        int cowTemp = cow-1;
        int columnTemp = 0;
        while ( !(data==null||data.length==0||(data.length==1&&data[0].length==0)) && cowTemp>=0 && columnTemp <column){
            if (data[cowTemp][columnTemp] == number){
                return true;
            }
            else if(data[cowTemp][columnTemp] < number){
                columnTemp++;
            }
            else {
                cowTemp--;
            }
        }
        return false;
    }
    public static void  main(String[] args){
        int[][] data = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] dataNull = new int[1][0];
        //System.out.println(dataNull[1][0]);
        System.out.print(findNumber(dataNull,10));

    }
}
