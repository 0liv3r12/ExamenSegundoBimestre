
package Vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Motocicleta extends Vehiculo{
    //Atributos
    boolean tieneCasco;
    String nombre;
    Motocicleta(String nombre, int numRuedas, int velocidadMaxima, boolean tieneCasco){
        super(numRuedas = 2, velocidadMaxima);
        this.tieneCasco = tieneCasco;
        this.nombre = nombre;
    }
    //metodos
    void Motocicleta() {
        JOptionPane.showMessageDialog(null, "La moto es un "+nombre+" con un numero de Ruedas de "+numRuedas +"y tiene casco de "+tieneCasco);
        Acelerar();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }
    
    
    @Override
    void Acelerar(){
       JOptionPane.showMessageDialog(null, "La moto cuenta con una velocidad maxima de "+velocidadMaxima+"K/H");
    }

    @Override
    void Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
