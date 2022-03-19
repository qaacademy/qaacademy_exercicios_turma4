package exercicios_intancias;

public class Excucao {

    public static void main(String[] args) {
        ExercicioInstancia obj_exercicioInstancia = new ExercicioInstancia();
        // variaveis
        System.out.println(obj_exercicioInstancia.idade);
        System.out.println(obj_exercicioInstancia.nome);
        // metodos
        obj_exercicioInstancia.exbirNome();
        obj_exercicioInstancia.exbirIdade();
        String profissao = obj_exercicioInstancia.exbirProfissao("QA");
        System.out.println(profissao);
    }

}
