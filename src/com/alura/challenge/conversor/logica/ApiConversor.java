package com.alura.challenge.conversor.logica;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ApiConversor {
    private String json;
    public void apiConversor() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/362f96062ac817d584c15f36/latest/USD"))
            .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    this.json = response.body();
    }

    public String getJson() {
        return json;
    }
}
