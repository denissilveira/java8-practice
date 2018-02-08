package br.com.estudos.alura.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Stringjoiner is used to construct a sequence of characters separated by a
 * delimiter and optionally starting with a supplied prefix and ending with a
 * supplied suffix.
 */
public class Stringjoiner {

    public static void main(String[] args) {
        
        // Method #1 - Simple Delimiter Join
        joinDelimiter();
        System.out.println();

        // Method #2 - Join using Prefix and Suffix
        joinerWithPrefixSuffix();
        System.out.println();

        // Method #3 - Join using ListJoiner
        listJoiner();
        System.out.println();

        // Method #4 - Collection Joiner
        collectorJoiner();
        System.out.println();

        // Method #5 - Merging two StringJoiner objects
        mergeJoiner();
    }

    // Method #1
    public static void joinDelimiter() {

        // Passing The Delimiter
        StringJoiner myString = new StringJoiner("-");

        // Joining Multiple Strings By Using 'add()' Method
        myString.add("Logan");
        myString.add("Magneto");
        myString.add("Storm");
        myString.add("Rogue");

        // Displaying The Output String
        System.out.println("StringJoiner with simple delimiter: " + myString);
    }

    // Method #2
    public static void joinerWithPrefixSuffix() {

        // Passing Hyphen(-) As Delimiter & Opening Bracket "(" As Prefix & Closing
        // Bracket ")" As Suffix
        StringJoiner myDate = new StringJoiner("-", "(", ")");

        // Joining Multiple Strings By Using 'add()' Method
        myDate.add("2018");
        myDate.add("Feb");
        myDate.add("01");

        // Displaying The Output String
        System.out.println("StringJoiner with Prefix and Suffix: " + myDate);
    }

    // Method #3
    public static void listJoiner() {

        List<String> dList = new ArrayList<String>();
        dList.add("SUNDAY");
        dList.add("MONDAY");
        dList.add("TUESDAY");
        dList.add("WEDNESDAY");
        dList.add("THURSDAY");
        dList.add("FRIDAY");
        dList.add("SATURDAY");

        // Passing The Delimiter
        String days = String.join(",", dList);

        // Displaying The Output String
        System.out.println("Join List with Delimiter: " + days);
    }

    // Method #4
    public static void collectorJoiner() {

        List<String> tList = Arrays.asList("Spring", "Java", "Hibernate", "AngularJs", "MongoDb");

        // Passing The Delimiter
        String tutorials = tList.stream().map(t -> t).collect(Collectors.joining(","));

        // Displaying The Output String
        System.out.println("Collector Joining: " + tutorials);
    }

    // Method #5
    public static void mergeJoiner() {

        // Passing Comma(,) As Delimiter & Opening Bracket "(" As Prefix & Closing
        // Bracket ")" As Suffix
        StringJoiner joiner1 = new StringJoiner(",", "{", "}");
        joiner1.add("one");
        joiner1.add("two");

        // Passing Colon(:) As Delimiter & Opening Bracket "(" As Prefix & Closing
        // Bracket ")" As Suffix
        StringJoiner joiner2 = new StringJoiner(":", "[", "]");
        joiner2.add("three");
        joiner2.add("four");
        joiner2.add("five");

        // Displaying The Output String
        StringJoiner mergeStr = joiner1.merge(joiner2);
        System.out.println("Merging two Stringjoiners: " + mergeStr);
    }

}