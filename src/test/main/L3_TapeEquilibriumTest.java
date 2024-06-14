package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class L3_TapeEquilibriumTest {

    private static Stream<Arguments> provideArraysForTest() {
        return Stream.of(
                Arguments.of(new Object[]{3,1,2,4,3}, 1),
                Arguments.of(new Object[]{3,1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTest")
    void testTapeEquilibriumTest(Object[]  inputArray, int expectedValue){
        L3_TapeEquilibrium tapeEquilibrium = new L3_TapeEquilibrium();

        var intArray = new int [inputArray.length];
        for(int i= 0;i<inputArray.length;i++){
            intArray[i]=(Integer)inputArray[i];
        }
        Assertions.assertEquals(tapeEquilibrium.solution(intArray),expectedValue);

    }

}