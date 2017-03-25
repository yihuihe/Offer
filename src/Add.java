/**
 * Created by hyh on 2017/3/25.
 */
public class Add {
    public static int AddNum(int num1, int num2) {
        int sum=0,cin=-1;
        while(cin!=0){
            sum = num1 ^ num2;
            cin = (num1 & num2) <<1;

            num1 = sum;
            num2 = cin;
        }
        return sum;
    }
/*
        int cin = 0;
        int temp1 = 0, temp2 = 0;
        Stack<Integer> stack = new Stack();
        while (num1 > 0 && num2 > 0) {
            temp1 = num1 % 10;
            temp2 = num2 % 10;
            if ((temp1 + temp2 + cin) >= 10) {
                stack.push((temp1 + temp2 + cin) % 10);
                cin = (temp1 + temp2 + cin) / 10;

            } else {
                cin = 0;
                stack.push(temp1 + temp2 + cin);
            }
            num1 /= 10;
            num2 /= 10;
        }
        if (num1 > 0) {
            double base = num1 * Math.pow(10.0, stack.size()) + cin * 10.0;

        }
        if (num2 > 0) {
            double base = num2 * Math.pow(10.0, stack.size()) + cin * 10.0;

        }
        double base = cin * Math.pow(10.0,(stack.size() ));
        while (!stack.isEmpty()) {
            int number = stack.pop();
            base += number * Math.pow(10.0, stack.size());
        }
        return (int) base;
*/

    public  static  void  main (String[] args){
        int a =3,b=0;
        System.out.print(AddNum(a,b));
    }
}
