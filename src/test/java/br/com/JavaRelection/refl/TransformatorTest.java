package br.com.JavaRelection.refl;

import br.com.JavaRelection.Produtora;
import br.com.JavaRelection.Filme;
import br.com.JavaRelection.FilmeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TransformatorTest {

    Filme filme = new Filme(1, "Avatar", "2009");
    Produtora produtora = new Produtora("Estados Unidos", 1935);

    @Test
    public void shouldTransformNewMovie() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // 1. Cria um novo objeto Filme com dados diferentes para o teste
        Filme novoFilme = new Filme(3, "The Matrix", "1999");

        // 2. Transforma o novo objeto Filme em FilmeDTO
        Transformator transformator = new Transformator();
        FilmeDTO filmeDTO = transformator.transform(novoFilme);

        // 3. Verifica se a transformação ocorreu corretamente
        Assertions.assertInstanceOf(FilmeDTO.class, filmeDTO);
        Assertions.assertEquals(novoFilme.getNomeFilme(), filmeDTO.getNomeFilme());
        Assertions.assertEquals(novoFilme.getAnoFilme(), filmeDTO.getAnoFilme());
    }

    @Test
    public void shouldNotTransform() {
        Assertions.assertThrows(ClassNotFoundException.class, () -> {
            Transformator transformator = new Transformator();
            transformator.transform(produtora);
        });
    }

    @Test
    public void shouldTransformWhenSomeFieldIsNull() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Filme filmeSemCPF = new Filme("Avatar");
        Transformator transformator = new Transformator();
        FilmeDTO filmeDTOSemAno = transformator.transform(filmeSemCPF);

        Assertions.assertEquals(filme.getNomeFilme(), filmeDTOSemAno.getNomeFilme());
        Assertions.assertNull(filmeDTOSemAno.getAnoFilme());
    }
}
