package br.com.estudos.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalDate dataFutura = LocalDate.of(2018, Month.SEPTEMBER, 28);
        
        Period periodo = Period.between(hoje, dataFutura);
        System.out.println(periodo.getMonths());
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dataFutura.format(formatador));
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }

}