
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
    
    public double sumar(){
        
        
        
        return this.c1+this.c2;
    }
  
      public double restar(){
    
        return this.c1-this.c2;
    }
        public double multiplicar(){
    
        return this.c1*this.c2;
    }
          public double dividir(){
              try {
                    return this.c1/this.c2;
                
                  
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,"Ingreso una division por cero");
                  return -1;
              }

    }
}
