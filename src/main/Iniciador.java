package main;

public class Iniciador {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.asignarCarro("AD-01-123", "Chevy 2015", "rojo");
        System.out.println(carro1.toString());
        
        Navio navio1 = new Navio();
        navio1.asignarNavio("PQ-1001-ZV", "Express 2017","azul");
        System.out.println(navio1.toString());
        
        Aeronave aeronave1 = new Aeronave();
        aeronave1.asignarAeronave("FN-251-ML", "Airbus 2019","blanco");
        System.out.println(aeronave1.toString());
        
        Ventana v1 = new Ventana();
        v1.setVisible(true);
    }
    
    
}
