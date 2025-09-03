package br.com.JavaRelection.refl;

import br.com.JavaRelection.Filme;

public class ObjectToJsonTester {

    public static void main(String... x) {
        Filme filme = new Filme(1, "Avatar", "2009");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(filme));
    }
}
