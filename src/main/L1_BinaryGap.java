package main;

import java.util.ArrayList;

public class L1_BinaryGap {

    public int solution(int N) {
        ArrayList<Integer> binaryGaps = new ArrayList<Integer>();
        // Implement your solution here
        if(N < 1)
            return 0;
        else {
            var binaryValue = Integer.toBinaryString(N);
            int count = 0;
            for(char c : binaryValue.toCharArray()){
                if (c == '0'){
                    count ++;
                }else {
                    if(count!=0){
                        binaryGaps.add(count);
                    }
                    count = 0;
                }
            }

        }
        return binaryGaps.stream().mapToInt(value -> (int)value).max()
                .orElse(0);
    }

}
