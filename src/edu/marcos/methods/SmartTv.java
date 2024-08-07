package edu.marcos.methods;

public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarVolume (int novoVolume) {
        volume = novoVolume;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

}
