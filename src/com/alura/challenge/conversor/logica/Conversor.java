package com.alura.challenge.conversor.logica;

public class Conversor {
    private int monedaConvertida;

    private int resultadoConversion;

    public int Conversor(int moneda){
        this.resultadoConversion = moneda*this.monedaConvertida;
        return this.resultadoConversion;
    }

    public int getMonedaConvertida() {

        return monedaConvertida;
    }

    public void setMonedaConvertida(int monedaConvertida) {
        this.monedaConvertida = monedaConvertida;
    }
}
