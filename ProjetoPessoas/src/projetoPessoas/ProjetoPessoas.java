package projetoPessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();
        Bolsista p1 = new Bolsista();
        
        p2.setNome("Maria");
        p1.setIdade(20);
        p2.setCurso("Informática");
        p2.setIdade(22);
        p2.setSexo("Feminino");
        p2.pagarMensalidade();
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        p1.setNome("Astroldo");
        p1.pagarMensalidade();
        p1.renovarBolsa();
        
        p2.setCurso("Informática");
        p2.fazerAniver();
        p3.setSalario(2500.75);
        
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
