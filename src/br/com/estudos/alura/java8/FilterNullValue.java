package br.com.estudos.alura.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValue {

    public static void main(String[] args) {
        
        List<String> cList = new ArrayList<String>();
        cList.add("United States of America");
        cList.add("Ecuador");
        cList.add("Denmark");
        cList.add(null);
        cList.add("Seychelles");
        cList.add("Germany");
        cList.add(null);

        System.out.println("<!-----Original list with null values-----!>");
        System.out.println(cList + "\n");

        // EXAMPLE #1 = Filter Null Values from a Stream Using 'Lambda Expressions'
        List<String> result = cList.stream()
                                  .filter(str -> str != null && str.length() > 0)
                                  .collect(Collectors.toList());
        
        System.out.println("<!-----Result after null values filtered-----!>");
        System.out.println(result + "\n");

        
        // EXAMPLE #2 = Filter Null Values from a Stream Using 'Method Reference'
        List<String> nonNullResult = cList.stream()
                                         .filter(Objects::nonNull)
                                         .collect(Collectors.toList());
        System.out.println("<!-----Result after null values filtered using nonNull-----!>");
        System.out.println(nonNullResult + "\n");

        
        // EXAMPLE #3 = Filter Null Values after Map intermediate operation
        List<String> mapNullResult = cList.stream()
                                         .map(s -> s).filter(str -> str != null && str.length() > 0)
                                         .collect(Collectors.toList());
        System.out.println("<!-----Result after null values filtered using Map intermediate operation-----!>");
        System.out.println(mapNullResult);
    }

}