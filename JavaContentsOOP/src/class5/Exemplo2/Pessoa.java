package class5.Exemplo2;

public class Pessoa {
    private String nome;
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Pessoa " + nome);
    }
    
    public String getNome() {
        return nome;
    }
}
