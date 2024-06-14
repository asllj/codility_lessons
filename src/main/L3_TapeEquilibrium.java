package main;

public class L3_TapeEquilibrium {
//Result BAD PERFORMANCE
//    public int solution(int[] A){
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i<A.length;i++){
//            var firstPart = A[i];
//            for(int j1= 0; j1 < i ;j1++){
//                firstPart += A[j1];
//            }
//            var secondPart = 0;
//            for(int j2=i+1; j2<A.length;j2++){
//                secondPart += A[j2];
//            }
//
//            var sum = Math.abs(firstPart-secondPart);
//            if(sum<min)
//                min = sum;
//        }
//
//        return min;
//    }

//Result 84% - complexity O(N) -> failed on correctness tests
//    public int solution(int[] A){
//        int min = Integer.MAX_VALUE;
//        int totalSum = 0;
//        var firstPart = 0;
//        for(int i = 0; i<A.length;i++){
//            totalSum += A[i];
//        }
//
//        for(int i = 0; i<A.length;i++){
//            firstPart += A[i];
//            var secondPart = totalSum-firstPart;
//            var cenas = Math.abs(firstPart - secondPart);
//            if(min>cenas)
//                min = cenas;
//        }
//        return min;
//    }

//Result 84% - complexity O(N) -> solution find on the internet. Same result as my second solution
    public int solution(int[] A){
        var sum1 = A[0];
        var sum2 = 0;
        int P = 1;
        for(int i = P; i<A.length;i++){
            sum2 += A[i];
        }

        int diff = Math.abs(sum1-sum2);

        for(; P<A.length;P++){
            sum1 += A[P];
            sum2 -= A[P];
            int newDiff = Math.abs(sum1-sum2);
            if( newDiff < diff) {
                diff = newDiff;
            }
        }
        return diff;
    }

}
