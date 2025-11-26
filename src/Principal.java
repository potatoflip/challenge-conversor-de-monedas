import com.alura.challenge.conversor.logica.ApiConversor;
import com.alura.challenge.conversor.logica.Textos;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        var conversor = new ApiConversor();
        var textos = new Textos();
        Scanner teclado = new Scanner(System.in);
        System.out.println(textos.textoConversion);
        conversor.setMoneda(teclado.nextLine());
        conversor.apiConversor();
        System.out.println(conversor.getJson());
}}
