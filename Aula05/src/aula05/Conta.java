package aula05;
public class Conta {
   public int numConta;
   protected String tipo;
   private String titular;
   private double saldo;
   private boolean status;

    public Conta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(false);
        this.setSaldo(0);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if (t == "cc") {
           this.setSaldo(50);
       } else if (t == "cp"){
           this.setSaldo(150);
       }
       System.out.println("Conta aberta com sucesso");
   }
   public void fecharConta(){
       if (this.getSaldo() > 0){
           System.out.println("Conta nao pode ser fechada, Existe Saldo na Conta");
       } else if (this.getSaldo() < 0) {
          System.out.println("Conta nao pode ser fechada, Saldo negativo");
       } else {
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso");
       }
   } 
   
   public void pagarMensalidade (){
     if (this.tipo == "cc"){
         this.saldo -= 10;
     } else {
         this.saldo -=20;
     }
   }
   
   public void depositar(double valor){
       if (this.getStatus()){
       this.setSaldo(this.getSaldo() + valor);
           System.out.println("Depósito realizado com sucesso na conta de "+this.getTitular());
       } else {
           System.out.println("Impossível depósito em conta fechada!");
       }
   }
   
   public void sacar(double valor){
       if (this.getStatus()){
           if (valor <= this.getSaldo()){
           this.setSaldo(this.getSaldo() - valor);
               System.out.println("Saque realizado na conta de "+getTitular());
       } else {
           System.out.println("Saldo Indisponível");
       }                  
   } else {
           System.out.println("Impossível saque em conta fechada!");
       }
} 
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
