package main;

public class L2_CyclicRotation {

    public int[] solution(int[] A, int K){
        int counter=1;
        if(A.length==0){
            return A;
        }
        while (counter<=K){
            var lastValue = A[A.length-1];
            for (int i = A.length-1;i>0;i--){
                A[i]=A[i-1];
            }
            A[0]=lastValue;
            counter++;
        }
        return A;
    }

}

//3 8 9 7 6

// 6 3 8 9 7
// A[0]= last
//A[1] = A[i-1] 6 3 8 9 7
//A[2] = A[i-1] 3 8 8 9 7
//A[3] = A[i-1] 3 8 9 9 7
//A[4] = A[i-1]  3 8 9 7 7  ---> começar daqui

