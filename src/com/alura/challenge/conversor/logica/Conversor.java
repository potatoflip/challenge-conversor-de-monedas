package com.alura.challenge.conversor.logica;

public class Conversor {
    private double valorAConvertir;


    public void setValorAConvertir(double valorAConvertir) {
        this.valorAConvertir = valorAConvertir;
    }

    public double resultados(BaseJson tasas, int tecladoMoneda){
        double valorDeConversion = Conversor(tasas, tecladoMoneda);
        double resultado = this.valorAConvertir * valorDeConversion;
        return resultado;

    }

    public double Conversor(BaseJson datos, int teclado){
        var tasa = datos.conversion_rates();

        return switch (teclado){
            case 1 -> tasa.usd();
            case 6 -> tasa.bob();
            case 2 -> tasa.ars();
            case 3 -> tasa.clp();
            case 4 -> tasa.cop();
            case 5 -> tasa.brl();

            default -> 0;
        };



    }
}

