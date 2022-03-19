package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        double valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal;
        int i = 1;
        String valorInvestimentoStg = JOptionPane.showInputDialog(
                "Digite um valor de investimento");
        valorInvestimento = Double.parseDouble(valorInvestimentoStg);
        valorTotal = valorInvestimento;
        while (i <= 10) {
            valorTotal = (valorTotal * taxaJuros) + valorTotal;
            i++;
        }
        valorJuros = valorTotal - valorInvestimento;
        System.out.println("Você investiu: " + valorInvestimento);
        System.out.println("Rendeu : "+valorJuros + "de Juros");
        System.out.println("O Valor total são : " + valorTotal);
    }

}
