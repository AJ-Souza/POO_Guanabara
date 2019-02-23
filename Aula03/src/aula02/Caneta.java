package aula02;

class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    private void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }
    public void tampar(){
        if (this.tampada == true){
            System.out.println("Caneta já tampada");
        } else {
            System.out.println("Caneta tampada");
        }
    }
    public void destampar(){
        if (this.tampada == true){
            System.out.println("Caneta destampada");
            this.tampada = false;
        }else {
            System.out.println("Caneta já destampada");
        }
    }
    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma Caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada ? "+this.tampada);
    }
    
}
