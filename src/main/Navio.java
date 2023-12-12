package main;

public class Navio extends Identificador {
    
    public void asignarNavio(String matricula, String marca,String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        
    }
    
    public void creaNavio(String matricula, String marca, String color) {
        this.creaNavio(matricula, marca, color);
    }
    
    public String toString() {
        return "El Navio tiene una matrícula " + matricula
                + " marca " + marca
                + " con color " + color;
    }
}
