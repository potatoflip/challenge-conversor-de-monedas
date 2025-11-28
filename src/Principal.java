import com.alura.challenge.conversor.logica.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        var apiConversor = new ApiConversor();
        var textos = new Textos();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Scanner teclado = new Scanner(System.in);
        String moneda;

        System.out.println(textos.textoInical);
        apiConversor.setMoneda(teclado.nextLine().toUpperCase());

        apiConversor.apiConversor();
        BaseJson datosMonedas = gson.fromJson(apiConversor.getJson(), BaseJson.class);

        System.out.println(textos.textoConversion);
        moneda = teclado.nextLine().toUpperCase();

        var conversor = new Conversor();

        System.out.println(textos.textoMonto);
        conversor.setValorAConvertir(teclado.nextDouble());

        System.out.println(conversor.resultados(datosMonedas, moneda));

        System.out.println(datosMonedas.conversion_rates());

        //System.out.println(apiConversor.getJson());
}}
