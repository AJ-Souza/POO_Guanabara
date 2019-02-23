package aula05;
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta("cc");
        c1.abrirConta("cc");
        c1.numConta = 123;
        c1.setTitular("Juvenal");
        c1.depositar(300);
        c1.pagarMensalidade();
        System.out.println("Correntista: "+c1.getTitular());
        System.out.println("Tipo da Conta "+c1.getTipo());
        System.out.println("Status da Conta: "+c1.getStatus());
        System.out.println("Saldo da Conta: "+c1.getSaldo());
        
        System.out.println("--------------------------------");
        
        Conta c2 = new Conta("cp");
        c2.abrirConta("cp");
        c2.numConta = 321;
        c2.setTitular("Astride");
        c2.depositar(500);
        c2.sacar(100);
        c2.pagarMensalidade();
        System.out.println("Correntista: "+c2.getTitular());
        System.out.println("Tipo da Conta "+c2.getTipo());
        System.out.println("Status da Conta: "+c2.getStatus());
        System.out.println("Saldo da Conta: "+c2.getSaldo());
        c2.fecharConta();
        c2.getStatus();
    }
    
}
