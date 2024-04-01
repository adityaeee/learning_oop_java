package com.enigma.static_example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Helper {
    public static String inputString(String info) {
        Scanner scanner = new Scanner(System.in);

//        return scanner.nextLine();

        while(true) {
            System.out.printf("%s : ", info);
            String input = scanner.nextLine();

            if (input.isEmpty() || input.isBlank()) {
                continue;
            }
            return input;
        }
    }

    public static String toRupiah(int value) {
//        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
//
//        formatRp.setCurrencySymbol("Rp ");
//        formatRp.setMonetaryDecimalSeparator(',');
//        formatRp.setGroupingSeparator('.');
//
//        kursIndonesia.setDecimalFormatSymbols(formatRp);
//        String result = kursIndonesia.format(value);
//        return result;

        String comma = "Rp #,###";
        DecimalFormat result = new DecimalFormat(comma);

        return result.format(value);
    }
}