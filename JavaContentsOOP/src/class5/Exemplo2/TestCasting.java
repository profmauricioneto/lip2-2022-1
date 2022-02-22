package class5.Exemplo2;

public class TestCasting {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("joaozinho");
        Funcionario p2 = (Funcionario) p1;
        p2.imprimir();
        p1.imprimir();
    }
}
