package polimorfismo;
public class Poodle extends Cachorro{
   
    public void reagir(String frase){
        if ("Toma Comida ".equals(frase) || "Olá".equals(frase)) {
            System.out.println("Abana o Rabo e Lati");
        } else {
                System.out.println("Rosna");
                }
    }
    public void reagir(int hora){
        if (hora <= 12){
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else {
                System.out.println("Abanar e Latir");
                }
    }
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Abana o Rabao");
        } else {
            System.out.println("Rosna");
        }
    }
}
