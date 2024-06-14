package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class L3_FrogJmpTest {

    @ParameterizedTest
    @CsvSource({"10,85,30,3","0,102,51,2"})
    void testFrogJumpsTest(int X, int Y, int D, int expectedValue){
        L3_FrogJmp frogJmp = new L3_FrogJmp();
        Assertions.assertEquals(frogJmp.solution(X, Y, D),expectedValue);

    }
}