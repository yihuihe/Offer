/**
 * Created by hyh on 2017/3/27.
 */
public class alibaba {
    /*
    static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {
        //TODO
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();
        int remainingNum = threadNum;
        int remainingRequest = requestNum;
        int min =0;
        int length  = rtList.length;
        while (remainingRequest !=0){
            if((--min)>0)
                continue;
            if(length<threadNum) {
                remainingRequest = remainingRequest - 200 * length;
                remainingNum = threadNum - length;
            }
            else
            {
                remainingRequest = remainingRequest - 200 * length;
                remainingNum = 0;
            }
            for(int j=0;j<length;j++){
                if(!map.containsKey(Integer.parseInt(rtList[j])))
                    map.put(Integer.parseInt(rtList[j]),1);
                else{
                    int temp = map.get(Integer.parseInt(rtList[j]));
                    map.replace(Integer.parseInt(rtList[j]),temp+1);
                }
            }

            for(Integer num : map.keySet()) {
                if(min>num)
                    min = num;
                list.add(num);
            }




        }


        return 0;
    }
*/
}
