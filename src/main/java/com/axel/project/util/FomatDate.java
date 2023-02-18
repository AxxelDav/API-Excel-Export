package com.axel.project.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FomatDate {

    public static String fechaFormateada(int dia, int mes, int anio) {
        Date date = new Date(anio,mes,dia);
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = DateFor.format(date);
        return stringDate;
    }
}
