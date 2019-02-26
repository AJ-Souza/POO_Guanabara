package projetofinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Qualquer Coisa");
        v[1] = new Video("Besterol sem Fim");
        v[2] = new Video("Faca algo de últil");
        
        System.out.println(v[0].toString());
        
        v[1].setAvaliacao(3);
        v[1].setCurtidas(1);
        v[1].like();
        v[1].play();
        
        System.out.println(v[1].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jurupeba", "F", 23, "jururu");
        g[1] = new Gafanhoto("Creuza", "F", 36, "cruz");
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
    }
    
}
