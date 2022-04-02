package easy;

public class Execucao {
    public static void main(String[] args) {
        // Exercicio02 exercicio02 = new Exercicio02();
        // System.out.println(exercicio02.retornaPalavraDigitada("Teste QA Academy"));

        // Exercicio03 exercicio03 = new Exercicio03();
        // System.out.println(exercicio03.exibeValoresTrocados(10, 20));

        // Exercicio04 exercicio04 = new Exercicio04();
        // System.out.println("O dobro do numero enviado: "+ 10 +" Será:
        // "+exercicio04.calcularDobro(10));

        Exercicio05 exercicio05 = new Exercicio05();

        System.out.println("A soma dos números digitados é: " + exercicio05.calcularSoma(10, 20, 30));
        System.out.println("A subtração dos números digitados é: " + exercicio05.calcularSubtracao(10, 20, 30));
        System.out.println("A multiplicacao dos números digitados é: " + exercicio05.calcularMultiplicacao(10, 20, 30));
        System.out.println("A media dos números digitados é: " + exercicio05.calcularMedia(exercicio05.calcularSoma(10, 20, 30)));
    }
}