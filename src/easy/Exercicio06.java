package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {

    public String verificaAprovacao(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2) / 2;
        if (resultado > 5) {
            return "Você está Aprovado! Parabéns!!!";
        }
        if (resultado < 5) {
            return ("Você está Reprovado!");
        }
        if (resultado == 5) {
            return ("Você está de Exame");
        }
        return "Não foi possívl calcular sua nota";
    }
}
