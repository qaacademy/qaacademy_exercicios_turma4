package medium;

public class Exercicio03 {
    public int somaAteMil(){
        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = i + soma;
            if (soma >= 1500) {
                break; // parar
            }
            i++;
        }
        return soma;
    }
}


