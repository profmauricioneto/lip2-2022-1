package class5.Exemplo1;

public class Animal {
    public void comer() {
        System.out.println("Animal comendo...");
    }
}

class Cachorro extends Animal {
    @Override
    public void comer() {
        System.out.println("Cachorro comendo...");
    }
}

class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("Gato comendo...");
    }
}

class Tigre extends Animal {
    @Override
    public void comer() {
        System.out.println("Tigre comendo...");
    }
}