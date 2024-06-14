package main;

import java.util.HashMap;
import java.util.Map;

public class L2_OddOccurrencesInArray {

    public int solution(int[] A){
        if(A.length>0){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i :A ){
                if (!map.containsKey(i)){
                    map.put(i,1);
                }else {
                    var currentValue = map.get(i).intValue();
                    map.put(i,currentValue+1);
                }
            }
            return map.entrySet().stream()
                    .filter(entryset-> entryset.getValue()%2!=0)
                    .findFirst()
                    .orElseThrow(RuntimeException::new)
                    .getKey();
        }
        throw new RuntimeException("Array lenght cannot be empty");

    }


}
