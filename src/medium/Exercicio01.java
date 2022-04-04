package medium;

public class Exercicio01 {

    public String[] verificarNumerosParImpar() {
        String[] vetorSoma = new String[101];

        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                vetorSoma[i] = "O Número: " + i + " é par";
            } else {
                vetorSoma[i] = "O Número: " + i + " é ímpar";
            }
            i++;

        }
        return vetorSoma; 

    }

}
