package projetofinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("A volta dos que nao foram");
        v[1] = new Video("Besterol sem Fim");
        v[2] = new Video("Poeira em Alto Mar");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jurupeba", "F", 23, "jururu");
        g[1] = new Gafanhoto("Creuza", "F", 36, "cruz");
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(85.0f);
        System.out.println(vis[1].toString());
       
        
    }
}
