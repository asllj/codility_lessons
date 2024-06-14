package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class L2_OddOccurrencesInArrayTest {

    private static Stream<Arguments> provideArraysForTest() {
        return Stream.of(

                Arguments.of(new Object[]{3, 7,8, 6, 7,3, 6}, 8),
             //   Arguments.of(new Object[]{0,0,0}, 1,new Object[]{0,0,0}),
             //   Arguments.of(new Object[]{}, 1,new Object[]{})
                Arguments.of(new Object[]{4},4),
                Arguments.of(new Object[]{9,3,9,3,9,7,9},7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTest")
    void testOddOccurrenciesInArrayTest(Object[] inputArray, int expectedValue){
        L2_OddOccurrencesInArray oddOccurrencesInArray = new L2_OddOccurrencesInArray();
        var intArray = new int [inputArray.length];
        for(int i= 0;i<inputArray.length;i++){
            intArray[i]=(Integer)inputArray[i];
        }
        Assertions.assertEquals(oddOccurrencesInArray.solution(intArray),expectedValue);

    }
}