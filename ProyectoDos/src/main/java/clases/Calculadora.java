
package clases;

import javax.swing.JOptionPane;


public class Calculadora {
    //Definimos los campos que vamos a recibir
    
    private double c1,c2;

    public Calculadora(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
    
    //Vemos un caso de una salida por pantalla y a la vez que cambie el contenido
    public double calcular(){
        
        try {
            double resultado= this.c1/(this.c2*this.c2);
            JOptionPane.showMessageDialog(null,"Indice de masa corporal:"+resultado);
            return resultado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingreso algun campo como letra en lugar de numerico");
        }   return 0;
        
    
    }
    
}
