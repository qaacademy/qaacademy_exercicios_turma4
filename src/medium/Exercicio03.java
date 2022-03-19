package medium;

public class Exercicio03 {
    public static void main(String[] args) {
        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = i + soma;
            if (soma >= 1500) {
                break; // parar
            }
            System.out.println(soma);
            i++;
        }
    }
}


