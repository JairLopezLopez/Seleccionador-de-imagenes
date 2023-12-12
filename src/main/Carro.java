package main;

public class Carro extends Identificador {
    
    public void asignarCarro(String matricula, String marca,String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        
    }
    
    public void creaCarro(String matricula, String marca, String color) {
        this.creaCarro(matricula, marca, color);
    }
    
    public String toString() {
        return "El Carro tiene una matrícula " + matricula
                + " marca " + marca
                + " con color " + color;
    }
}
