package medium;

public class Execucao {

    public static void main(String[] args) {
        // Exercicio02 exercicio02 = new Exercicio02();
        // double valorInvestimento = 100000.00;
        // double valorJuros =
        // exercicio02.calcularInvestimentoJurosCompostos(valorInvestimento);
        // double valorTotal = valorInvestimento + valorJuros;

        // System.out.println("O Valor investido rendeu : " + valorJuros + "de Juros");
        // System.out.println("Você investiu: " + valorInvestimento);
        // System.out.println("O Valor total são : " + valorTotal);

        // Exercicio03 exercicio03 = new Exercicio03();
        // System.out.println(exercicio03.somaAteMil());

        // Exercicio04 exercicio04 = new Exercicio04();

        // exibirVetor(exercicio04.multiplicaAteMil());

        // int[] vetorNumeros = { 5, 4, 8, 1, 2 }; // Cria o vetorEpreenche os valores
        // Exercicio05 exercicio05 = new Exercicio05();
        // System.out.println(exercicio05.verificaMenorValor(vetorNumeros));


        Exercicio06 exercicio06 = new Exercicio06(); 
        System.out.println(exercicio06.calculaFatorial(5));

    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }

}