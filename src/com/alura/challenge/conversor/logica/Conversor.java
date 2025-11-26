package com.alura.challenge.conversor.logica;

public class Conversor {
    private int monedaConvertida;

    public int Conversor(int moneda){
        return moneda*this.monedaConvertida;

    }

    public int getMonedaConvertida() {
        return monedaConvertida;
    }

    public void setMonedaConvertida(int monedaConvertida) {
        this.monedaConvertida = monedaConvertida;
    }
}
