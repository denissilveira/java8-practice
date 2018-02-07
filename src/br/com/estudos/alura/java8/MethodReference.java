package br.com.estudos.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
    
public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<String>();
        palavras.add("Java8");
        palavras.add("Estudar mais");
        palavras.add("Ordenacao");
        
        palavras.sort(Comparator.comparing(s -> s.length())); 
        
        palavras.sort(Comparator.comparing(String::length)); // Method Reference
        
        palavras.forEach(s -> System.out.println(s));
        
        palavras.forEach(System.out::println); // Method Reference
    }

}