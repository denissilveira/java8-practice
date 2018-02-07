package br.com.estudos.alura.java8;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {
    
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<String>();
        palavras.add("Java8");
        palavras.add("Estudar mais");
        palavras.add("Ordenacao");
        
        palavras.sort((s1, s2) -> {
            if(s1.length() < s2.length())
                return -1;
            else if (s1.length() > s2.length())
                return 1;
            return 0;
        });
        
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
        palavras.forEach(s -> System.out.println(s)); 
    }

}
