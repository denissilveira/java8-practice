package br.com.estudos.alura.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

    public static void main(String[] args) {
        
        String date = "";
        LocalDate localDate = null;
        DateTimeFormatter formatter = null;
        // Converting 'dd-MMM-yyyy' String format to LocalDate
        date = "08-Feb-2018";
        formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        localDate = LocalDate.parse(date, formatter);
        System.out.println("Input Date= " + date);
        System.out.println("Converted Date= " + localDate + "\n");
        
        // Converting 'EEEE, MMM d yyyy' String format to LocalDate
        date = "Thursday, Feb 08 2018";
        formatter = DateTimeFormatter.ofPattern("EEEE, MMM d yyyy");
        localDate = LocalDate.parse(date, formatter);
        System.out.println("Input Date= " + date);
        System.out.println("Converted Date= " + localDate + "\n");

        // Converting 'dd/MM/YY' String format to LocalDate
        date = "08/02/18";
        formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        localDate = LocalDate.parse(date, formatter);
        System.out.println("Input Date= " + date);
        System.out.println("Converted Date= " + localDate + "\n");

        // Converting 'YYYYMMDD' String format to LocalDate
        date = "20180208";
        formatter = DateTimeFormatter.BASIC_ISO_DATE;
        localDate = LocalDate.parse(date, formatter);
        System.out.println("Input Date?= " + date);
        System.out.println("Converted Date?= " + localDate);
    }

}