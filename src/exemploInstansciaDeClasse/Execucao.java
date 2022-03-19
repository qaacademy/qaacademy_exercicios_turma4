package exemploInstansciaDeClasse;

public class Execucao {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro(); // Instanciei
        dog.nome = "TOTO";
        dog.peso = 55; 
        dog.exibirNome();
        System.out.println( dog.exibirPeso());
    }
}
