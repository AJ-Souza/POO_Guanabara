package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Aldo", "Masc", 43);
        p[1] = new Pessoa("Sabrina", "Femin", 39);
        l[0] = new Livro("Poeira em Alto Mar", "Paranóico", 398, p[0]);
        l[1] = new Livro("Incêndio na Caixa D'água", "Retardado da Silva", 413, p[0]);
        l[2] = new Livro("Flor de Espinhos", "Tibúrcio Ferreira", 547, p[1]);
        
        l[0].abrir();
        l[0].folhear(398);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
