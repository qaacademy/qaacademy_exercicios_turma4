package easy;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        
        int numero1;
        int numero2; 
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero")); 
        // Double.parseDouble(JOptionPane.showInputDialog("Digite um outro numero"));
        
        System.out.println("O valor do primeiro numero é :" + numero2);
        System.out.println("O valor do segundo numero é :" + numero1);

    }
    
}
