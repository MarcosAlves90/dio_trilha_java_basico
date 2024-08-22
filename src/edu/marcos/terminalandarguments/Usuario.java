package edu.marcos.terminalandarguments;

import java.util.Scanner;
import java.util.Locale;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        smartTv.ligar();

        smartTv.mudarVolume(60);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(5);

        System.out.println("Enter the TV name: ");
        String nomeTV = scanner.next();

        showInfo(smartTv, nomeTV);

    }

    private static void showInfo(SmartTv tv, String nomeTV) {

        System.out.println("\n--------------------------------");
        System.out.println("The TV name is: " + nomeTV);
        System.out.println("The TV is on? " + tv.ligada);
        System.out.println("The volume is: " + tv.volume);
        System.out.println("The channel is: " + tv.canal);
        System.out.println("--------------------------------");

    }

}
