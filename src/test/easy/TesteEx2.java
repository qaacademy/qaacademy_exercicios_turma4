package test.easy;


import org.junit.Assert;
import org.junit.Test;

import easy.Exercicio02;

public class TesteEx2 {

    @Test
    public void testePalavraDigitada() {
        Exercicio02 exercicio02 = new Exercicio02();
        exercicio02.retornaPalavraDigitada("Teste");
        Assert.assertEquals("Voce digitou: Teste", exercicio02.retornaPalavraDigitada("Teste"));
    }

}
