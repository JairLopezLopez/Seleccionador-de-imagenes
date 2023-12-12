
package main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public Ventana(){
        this.setSize(500, 500); //tamaño de ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //deja de ejecutar cuando se presiona cerrar
        setTitle("Proyecto poo"); //titulo del proyecto
        setLocationRelativeTo(null); //hace aparecer la ventana en medio

    }  
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //se crea panel
        panel.setBackground(Color.GREEN); //se agrega color al panel
        this.getContentPane().add(panel); //se añade panel
        JLabel etiqueta = new JLabel ("bienvenido"); //se dice el texto de la etiqueta
        panel.add(etiqueta); //se agrega etiqueta al panel
        JLabel etiqueta2 = new JLabel(new ImageIcon("images.jpg"));
        panel.add(etiqueta2);
  
    }
    
    private void iniciarbotones(){
        JButton boton1 = new JButton(); //Se crea boton
        boton1.setBounds(100, 100, 100, 40); // se declara el tamaño y posicion
       
    }
    
}
