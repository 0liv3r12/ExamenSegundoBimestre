
package Vehiculos;

/**
 *
 * @author Oliver Torres
 */
public abstract class Vehiculo {
    //Atributos
    int numRuedas;
    int velocidadMaxima;
    Vehiculo(int numRuedas, int velocidadMaxima) {
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }
    //Metodos
    abstract void Vehiculo();
    abstract void Acelerar();
    
    
    
}
