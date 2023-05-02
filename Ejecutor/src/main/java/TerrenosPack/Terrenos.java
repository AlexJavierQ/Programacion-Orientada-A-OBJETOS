
package TerrenosPack;

/**
 *
 * @author alexj
 */
public class Terrenos {
    private int costo_terreno;
    private int ancho;
    private int largo;
    private int area;
    private int valorMetroCuadrado;
    
    // Set Costo terreno
    public void setCosto_Terreno(int costo_terreno) {
         this.costo_terreno = costo_terreno;
    }
      public int getCosto_Terreno() {
         return costo_terreno;
    }   
      //Ancho
       public void setAncho(int ancho) {
         this.ancho = ancho;
    }
      public int getAncho() {
         return ancho;
    }   
      //Largo
       public void setLargo(int largo) {
         this.largo = largo;
    }
      public int getLargo() {
         return largo;
    }   
            //Area
       public void setArea(int area) {
         this.area = area;
    }
      public int getArea() {
         return area;
         }
         //Valor por metro cuadrado
       public void setValorMetroCuadrado(int valorMetroCuadrado) {
         this.valorMetroCuadrado = valorMetroCuadrado;
    }
      public int getValorMetroCuadrado() {
         return valorMetroCuadrado;
         }
      
      // Cálcular Área del Terreno
      public void calcularArea(){ 
          area = ancho*largo;
      }
      
         // Cálcular el valor del Terreno 
      public void calcularCosto_Terreno(){ 
         costo_terreno = area*valorMetroCuadrado;
      }
}
      



  
 
 