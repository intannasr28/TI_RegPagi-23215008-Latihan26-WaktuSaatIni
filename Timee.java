package pert6;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Locale;

public class Timee {

    public static void main(String[] args) {
       
        LocalDateTime sekarang = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy HH:mm 'WIB'", new Locale("id", "ID"));

        String waktuFormatted = sekarang.format(formatter);

        System.out.println("Hari ini adalah hari: " + waktuFormatted);
    }
}
   

