package main;

public class Aeronave extends Identificador {
    
    public void asignarAeronave(String matricula, String marca,String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        
    }
    
    public void creaAeronave(String matricula, String marca, String color) {
        this.creaAeronave(matricula, marca, color);
    }
    
    public String toString() {
        return "La Aeronave tiene una matrícula " + matricula
                + " marca " + marca
                + " con color " + color;
    }
}
