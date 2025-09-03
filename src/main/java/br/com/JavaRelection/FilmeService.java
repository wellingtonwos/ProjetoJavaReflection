package br.com.JavaRelection;

import br.com.JavaRelection.refl.Transformator;
import java.lang.reflect.InvocationTargetException;

public class FilmeService {

    public FilmeDTO list() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Filme filme = new FilmeRepository().list();
        FilmeDTO filmeDTO = new Transformator().transform(filme);
        return filmeDTO;
    }
}
