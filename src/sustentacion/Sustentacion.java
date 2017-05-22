/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author paolaramos
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int num1 = 0;
        int num2 = 0;
        int suma;
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "   Que Desea hacer \n1. saber Iguales  \n2 numero Mayor"));
        if (respuesta == 1) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer numero "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo numero  "));
            if (num1 == num2) {
                JOptionPane.showMessageDialog(null, "los numeros son iguales");
            } else {
                JOptionPane.showMessageDialog(null, "los numeros son distintos");
            }
        }
        if (respuesta == 2) {
            int nume1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero "));
            int nume2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero "));
            if (nume1 > nume2) {
                JOptionPane.showMessageDialog(null, "el numero mayor es: " + nume1);
            } else if (nume2 > nume1) {
                JOptionPane.showMessageDialog(null, "el numero mayor es: " + nume2);
            }

        }

    }
}
