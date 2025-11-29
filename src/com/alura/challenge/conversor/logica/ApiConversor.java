package com.alura.challenge.conversor.logica;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ApiConversor {

    private String json;

    private int monedaSeleccionada;

    public void setMonedaSeleccionada(int monedaSeleccionada) {
        this.monedaSeleccionada = monedaSeleccionada;
    }

    public String setMoneda(int moneda) {

        return switch (moneda){
            case 1 -> "USD";
            case 6 -> "BOB";
            case 2 -> "ARS";
            case 3 -> "CLP";
            case 4 -> "COP";
            case 5 -> "BRL";

            default -> "";
        };
    }

    public void apiConversor() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/362f96062ac817d584c15f36/latest/"+ setMoneda(this.monedaSeleccionada)))
            .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    this.json = response.body();
    }

    public String getJson() {

        return json;
    }
}
