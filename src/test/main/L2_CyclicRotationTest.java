package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class L2_CyclicRotationTest {

    private static Stream<Arguments> provideArraysForTest() {
        return Stream.of(
                Arguments.of(new Object[]{3, 8, 9, 7, 6}, 3,new Object[]{9, 7, 6,3, 8}),
                Arguments.of(new Object[]{0,0,0}, 1,new Object[]{0,0,0}),
                Arguments.of(new Object[]{}, 1,new Object[]{})
        );
    }



    @ParameterizedTest
    @MethodSource("provideArraysForTest")
    public void testCyclicRotationTest2(Object[] inputArray, int k, Object[] expectedArray){
        L2_CyclicRotation cyclicRotation = new L2_CyclicRotation();
        var intArray = new int [inputArray.length];
        var expectedIntArray = new int [inputArray.length];
        for(int i= 0;i<inputArray.length;i++){
            intArray[i]=(Integer)inputArray[i];
            expectedIntArray[i]=(Integer)expectedArray[i];
        }
        Assertions.assertArrayEquals(cyclicRotation.solution(intArray,k),expectedIntArray);

    }
}