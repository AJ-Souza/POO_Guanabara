package ultraEmojiCombat;
public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    //metodos publicos
    public void apresentar(){
        System.out.println("---------------------------------");
        System.out.println("Apresentamos agora o Lutador !!!!");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" Anos");
        System.out.println("Altura: "+this.getAltura()+" / Peso: "+this.getPeso()+"Kg");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println(" * * * CARTEL * * *");
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("---------------------------------");
    }
    public void status(){
        System.out.println("----------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println(this.getDerrotas()+" Derrotas");
    }
    public void ganharLuta(){
     this.setVitorias(this.getVitorias()+1);
     //a linha de cima escrita de outra forma:
     // this.vitorias = this.vitorias + 1;
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi,int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
       this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Categoria Inválida";
        } else if (peso <= 70.3){
            this.categoria = "Leve";
        }  else if (peso <= 83.9){
            this.categoria = "Médio";
        }   else if (peso <= 120.2){
            this.categoria = "Pesado";
        }  else {
            this.categoria = "Categoria Inválida";
            }                          
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
