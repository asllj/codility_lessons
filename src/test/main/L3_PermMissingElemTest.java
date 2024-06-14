package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class L3_PermMissingElemTest {

    private static Stream<Arguments> provideArraysForTest() {
        return Stream.of(
                Arguments.of(new Object[]{}, 1),
                Arguments.of(new Object[]{2,3,1,5}, 4),
                Arguments.of(new Object[]{5,2,4,7,3,6},1),
                Arguments.of(new Object[]{5,2,4,1,3,6},7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTest")
    void testPermMissingElementTest(Object[]  inputArray, int expectedValue){
        L3_PermMissingElem missingElem = new L3_PermMissingElem();

        var intArray = new int [inputArray.length];
        for(int i= 0;i<inputArray.length;i++){
            intArray[i]=(Integer)inputArray[i];
        }
        Assertions.assertEquals(missingElem.solution(intArray),expectedValue);

    }
}


