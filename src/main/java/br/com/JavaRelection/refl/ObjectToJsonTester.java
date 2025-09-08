package br.com.JavaRelection.refl;

import br.com.JavaRelection.Filme;

import java.util.ArrayList;
import java.util.List;

public class ObjectToJsonTester {

    public static void main(String... x) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1, "Avatar", "2009"));
        filmes.add(new Filme(2, "O Senhor dos Anéis", "2001"));
        filmes.add(new Filme(3, "Matrix", "1999"));
        filmes.add(new Filme(4, "Harry Potter", "2001"));
        // 2. Cria a instância do ObjectToJson
        ObjectToJson objectToJson = new ObjectToJson();

        // 3. Itera sobre a lista e imprime o JSON de cada filme
        for (Filme filme : filmes) {
            System.out.println(objectToJson.transform(filme));
        }
    }
}
