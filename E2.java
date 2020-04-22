/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

/**
 *
 * @author emili
 */
import javax.swing.JOptionPane;
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n=JOptionPane.showInputDialog("Ingresa los numeros");
        String msg="";
       int x=(new Integer(n)).intValue();
       int suma=0;
       
       while(x>0){
       suma+=x%10;
       x/=10;
       }
       while(suma>9){ 
       x=suma;
       suma=0;
       while(x>0){
       suma+=x%10;
       x/=10;
       }
       }
       JOptionPane.showMessageDialog(null,suma);
    }
    
}
