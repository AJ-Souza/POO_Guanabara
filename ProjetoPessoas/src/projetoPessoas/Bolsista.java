package projetoPessoas;
public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Bolsa do Aluno: "+this.getNome() +" será Renovada");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade será Paga com desconto do Aluno: "+this.getNome());
    }
}
