package br.com.estudos.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class OptionalStream {

public static void main(String[] args) {
        
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        
        cursos.sort(Comparator.comparingInt(Curso::getAlunos)); // int

        int sum = cursos.stream()
                    .filter(c -> c.getAlunos() >= 100)
                    .mapToInt(Curso::getAlunos) // Stream Int
                    .sum();
        System.out.println(sum);
        
        Optional<Curso> optionalCurso = cursos.stream()
                                    .filter(c -> c.getAlunos() >= 100)
                                    .findAny();
        
        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        Curso curso = optionalCurso.orElse(null);
        
        cursos.stream()
            .filter(c -> c.getAlunos() >= 100)
            .findAny()
            .ifPresent(c -> System.out.println(c.getNome()));
        
        OptionalDouble media = cursos.stream()
                                   .filter(c -> c.getAlunos() >= 100)
                                   .mapToInt(Curso::getAlunos) 
                                   .average();
        
        List<Curso> cursosFiltrados = cursos.stream()
                                          .filter(c -> c.getAlunos() >= 100)
                                          .collect(Collectors.toList());
        
        Map<String, Curso> mapas = cursos.stream()
                                        .filter(c -> c.getAlunos() >= 100)
                                        .collect(Collectors.toMap(c -> c.getNome(), c -> c));
    }
}