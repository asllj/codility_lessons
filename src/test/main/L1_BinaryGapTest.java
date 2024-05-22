package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class L1_BinaryGapTest {

    @ParameterizedTest
    @CsvSource({"1041,5", "0,0", "-1,0"})
    public void testBinaryGapTest(String input, String expected){
        L1_BinaryGap binaryGap = new L1_BinaryGap();
        int N =  Integer.valueOf(input);
        int expectedValue = Integer.valueOf(expected);
        Assertions.assertEquals(binaryGap.solution(N),expectedValue);

    }

}