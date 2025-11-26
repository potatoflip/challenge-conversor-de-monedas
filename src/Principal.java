import com.alura.challenge.conversor.logica.ApiConversor;
import com.alura.challenge.conversor.logica.Textos;

import java.io.IOException;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        var conversor = new ApiConversor();
        var textos = new Textos();
        conversor.apiConversor();
        System.out.println(conversor.getJson());
        System.out.println(textos.textoInical);
}}
