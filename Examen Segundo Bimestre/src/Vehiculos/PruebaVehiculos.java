package Vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PruebaVehiculos {
    
    public static void main(String[] args) {
        Automovil[] carro;
        Motocicleta[] moto;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos automoviles desea ingresar"));
        carro = new Automovil[num];

        for (int i = 0; i < carro.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese los nombres de los vehiculos");
            int velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehiculo"));
            int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
            carro[i] = new Automovil(nombre, 4, velocidad, puertas);
        }
        String lista = "----Lista de carro---" + "\n";
        for (int j = 0; j < carro.length; j++) {
            lista = lista + (j + 1) +"  "+ carro[j].getNombre() + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
        //Motos
        int numM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos automoviles desea ingresar"));
        moto = new Motocicleta[numM];

        for (int i = 0; i < moto.length; i++) {
            String nombreM = JOptionPane.showInputDialog("Ingrese los nombres de los vehiculos");
            int velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehiculo"));
            int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
            int casco = JOptionPane.showConfirmDialog(null, "Tiene casco?");
            if(casco==0){
                boolean tieneCasco = false;
                moto[i] = new Motocicleta(nombreM, 4, velocidad, tieneCasco);
            }else{
                boolean tieneCasco = true;
                moto[i] = new Motocicleta(nombreM, 4, velocidad, tieneCasco);
            }
            
        }
        String list = "----Lista de motos---" + "\n";
        for (int j = 0; j < moto.length; j++) {
            list = list + (j + 1) +"  "+ moto[j].getNombre() + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
    
}
