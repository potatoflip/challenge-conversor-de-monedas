import com.alura.challenge.conversor.logica.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jdi.IntegerValue;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        var apiConversor = new ApiConversor();
        var textos = new Textos();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Scanner teclado = new Scanner(System.in);
        String seleccion;
        String moneda;
        String monto;
        int opcion;
        int opcion2;
        double opcion3;
        String opcion4 = "";
        boolean continuaPrograma = true;

        while(continuaPrograma){
            //valida el ingreso de la primera moneda.
            while(true){
                System.out.println(textos.textoInical);
                try{
                    seleccion = teclado.nextLine();
                    opcion = Integer.parseInt(seleccion);
                }catch (NumberFormatException e){
                    System.out.println(textos.textoError + " "+e.getMessage());
                    continue;
                }
                if (opcion == 0){
                    System.out.println(textos.textoInical);
                    continuaPrograma = false;
                    break;
                }
                if (opcion<0||opcion>6){
                    System.out.println(textos.textoError);
                    continue;
                }
                break;
            }
            if (!continuaPrograma) break;

            apiConversor.setMonedaSeleccionada(Integer.parseInt(seleccion));
            apiConversor.apiConversor();
            BaseJson datosMonedas = gson.fromJson(apiConversor.getJson(), BaseJson.class);
            while(true){
                System.out.println(textos.textoConversion);

                try{
                    moneda = teclado.nextLine();
                    opcion2 = Integer.parseInt(moneda);
                }catch (NumberFormatException e){
                    System.out.println(textos.textoError + " "+e.getMessage());
                    continue;
                }
                if (opcion2 == 0){
                    continuaPrograma = false;
                    System.out.println(textos.textoSalida);
                    break;
                }
                if (opcion2<0||opcion2>6){
                    System.out.println(textos.textoError);
                    continue;
                }
                break;
            }

            if (!continuaPrograma) break;
            var conversor = new Conversor();

            while (true){
                System.out.println(textos.textoMonto);
                monto = teclado.nextLine();
                try {
                    opcion3 = Double.parseDouble(monto);
                }catch (NumberFormatException e){
                    System.out.println(textos.textoErrorMonto +" " + e.getMessage());
                    continue;
                }
                break;
            }
            if (!continuaPrograma) break;

            conversor.setValorAConvertir(Double.parseDouble(monto));
            System.out.println("El monto convertido es: " +
                    conversor.resultados(datosMonedas, Integer.parseInt(moneda))+" "+
                    apiConversor.setMoneda(Integer.parseInt(moneda)));
            while(true){
                System.out.println("Desea volver a ejecutar el programa? 'Y' para continuar 'N' para salir");
                opcion4 = teclado.nextLine().trim().toUpperCase();
                if (opcion4.equals("Y")){
                    continue;
                }
                if(opcion4.equals("N")){
                    continuaPrograma = false;
                    System.out.println(textos.textoSalida);
                    break;
                }
                System.out.println("Opción no válida, por favor escriba 'Y' o 'N'.");
            }
        }
}}
