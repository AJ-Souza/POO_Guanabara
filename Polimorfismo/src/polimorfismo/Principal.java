package polimorfismo;
public class Principal {
    public static void main(String[] args) {
        Animal m = new Mamifero();
        Animal r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setIdade(2);
        m.setPeso(2.67f);
        m.alimentar();
        m.emitirSom();
        m.locomover();
        System.out.println("------------");
        Canguru k = new Canguru();
        k.alimentar();
        k.emitirSom();
        k.locomover();
        System.out.println("xxxxxxxxxxxxxxxxx");
        r.setIdade(1);
        r.setPeso(1.10f);
        r.alimentar();
        r.emitirSom();
        r.locomover();
        System.out.println("------------");
        Tartaruga t = new Tartaruga();
        t.alimentar();
        t.emitirSom();
        t.locomover();
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        p.setIdade(1);
        p.setPeso(0.3f);
        p.alimentar();
        p.emitirSom();
        p.locomover();
        System.out.println("------------");
        a.setIdade(1);
        a.setPeso(0.94f);
        a.alimentar();
        a.emitirSom();
        a.locomover();
    }
}
