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
      int num1=0;
      int num2=0;
      int suma;
        
       num1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el primer numero "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el segundo numero  "));
        
        if(num1==num2){
        
        
       
  JOptionPane.showMessageDialog(null,"los numeros son iguales");
  
  
  
        }else{
            JOptionPane.showMessageDialog(null,"los numeros son distintos");
        }
        
    }
    
    }
    

