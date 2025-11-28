package com.alura.challenge.conversor.logica;

public class Conversor {
    private double valorAConvertir;


    public void setValorAConvertir(double valorAConvertir) {
        this.valorAConvertir = valorAConvertir;
    }

    public double resultados(BaseJson tasas, String tecladoMoneda){
        double valorDeConversion = Conversor(tasas, tecladoMoneda);
        double resultado = this.valorAConvertir * valorDeConversion;
        return resultado;

    }

    public double Conversor(BaseJson datos, String teclado){
        var tasa = datos.conversion_rates();

        return switch (teclado){
            case "USD" -> tasa.usd();
            case "BOB" -> tasa.bob();
            case "ARS" -> tasa.ars();
            case "CLP" -> tasa.clp();
            case "COP" -> tasa.cop();
            case "BRL" -> tasa.brl();

            default -> 0;
        };



    }
}

