package br.com.estudos.alura.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToList {

    public static void main(String[] args) {
        /**** Converting a Primitive 'int' Array to List ****/
        int intArray[] = { 1, 2, 3, 4, 5 };
        List<Integer> integerList1 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("List #1: " + integerList1);
       
        
        /**** 'IntStream.of' or 'Arrays.stream' Gives The Same Output ****/
        List<Integer> integerList2 = IntStream.of(intArray).boxed().collect(Collectors.toList());
        System.out.println("List #2: " + integerList2);

        /**** Converting an 'Integer' Array to List ****/
        Integer integerArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> integerList3 = Arrays.stream(integerArray).collect(Collectors.toList());
        System.out.println("List #3: " + integerList3);
    }

}
