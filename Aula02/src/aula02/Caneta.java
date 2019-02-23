package aula02;

class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    public void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }
    public void tampar(){
        if (tampada == true){
            System.out.println("Caneta já tampada");
        } else {
            System.out.println("Caneta tampada");
        }
    }
    public void destampar(){
        if (tampada == true){
            System.out.println("Caneta destampada");
            this.tampada = false;
        }else {
            System.out.println("Caneta já destampada");
        }
    }
}
