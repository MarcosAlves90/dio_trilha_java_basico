package edu.marcos.methods;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.mudarVolume(60);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(5);

        String nomeTV = args [0];

        showInfo(smartTv, nomeTV);

    }

    private static void showInfo( SmartTv tv, String nomeTV) {

        System.out.println("--------------------------------");
        System.out.println("The TV name is: " + nomeTV);
        System.out.println("The TV is on? " + tv.ligada);
        System.out.println("The volume is: " + tv.volume);
        System.out.println("The channel is: " + tv.canal);
        System.out.println("--------------------------------");

    }

}
