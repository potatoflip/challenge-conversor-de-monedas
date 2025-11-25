import com.alura.challenge.conversor.logica.ApiConversor;

import java.io.IOException;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        var conversor = new ApiConversor();
        conversor.apiConversor();
        System.out.println(conversor.getJson());
}}
