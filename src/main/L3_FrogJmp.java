package main;


public class L3_FrogJmp {

    public int solution(int X, int Y, int D){
        var remainingJumps = (double) (Y - X)/D;
        return (int) Math.ceil(remainingJumps);
    }


}
