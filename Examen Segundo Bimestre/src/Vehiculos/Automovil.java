
package Vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Torres
 */
public class Automovil extends Vehiculo {
    //Atributos
    String nombre;
    int numPuertas;
    Automovil(String nombre, int numRuedas, int velocidadMaxima, int numPuertas) {
        super(numRuedas, velocidadMaxima);
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        Vehiculo();
    }
    //Metodos
    @Override
    
    void Vehiculo() {
        JOptionPane.showMessageDialog(null, "El Automovil es un "+nombre+" con un numero de Ruedas de "+numRuedas+" con numero de puertas"
                + "de "+numPuertas);
        Acelerar();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    
    @Override
    void Acelerar(){
       JOptionPane.showMessageDialog(null, "El carro cuenta con una velocidad maxima de "+velocidadMaxima+"K/H");
    }
}
