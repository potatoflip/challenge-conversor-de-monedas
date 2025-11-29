package com.alura.challenge.conversor.logica;

public class Textos {

    public String textoMonedas = """
            1.- Dolar Americano (USD)
            2.- Peso Argentino (ARS)
            3.- Peso Chileno (CLP)
            4.- Peso Colombiano (COP)
            5.- Real Brasileño (BRL)
            6.- Boliviano (BOB)  
            
            0.-Salir del sistema 
            """;
    public String textoInical = "\nDigite el nùmero la moneda inicial que desea convertir:" + "\n" + textoMonedas;

    public String textoConversion = "\nDigite el nùmero de la moneda conversora:" + "\n" + textoMonedas;

    public String textoMonto = "\nIngrese el monto a convertir: ";

    public String textoError = "Opcion invàlida. Deber ingresar un número entero entre 0 y 6";

    public String textoErrorMonto = "Ingrese un monto valido.";

    public String textoSalida ="Saliendo del sistema, gracias por usar el conversor.";
}
