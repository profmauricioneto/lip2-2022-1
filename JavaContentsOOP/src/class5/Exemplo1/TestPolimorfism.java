package class5.Exemplo1;

public class TestPolimorfism {
    public static void main(String[] args) {
        Animal animais[] = new Animal[4];

        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Tigre();
        animais[3] = new Animal();
        
        for (int i = 0; i < animais.length; i++) {
            animais[i].comer();
        }
    }
}
