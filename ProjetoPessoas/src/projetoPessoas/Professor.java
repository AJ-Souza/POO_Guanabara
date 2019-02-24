package projetoPessoas;
public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    public void receberAumento(int porcento){
        this.salario = this.salario + ((this.salario * porcento)/100);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
