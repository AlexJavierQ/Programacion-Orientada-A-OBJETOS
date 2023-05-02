
package EjecutorPack;
import TerrenosPack.Terrenos;


public class Ejecutor {

    public static void main(String[] args) {
        Terrenos epsilon = new Terrenos();
        epsilon.setAncho(21);
        epsilon.setLargo(12);
        epsilon.setValorMetroCuadrado(4);
        epsilon.calcularArea();
        epsilon.calcularCosto_Terreno();
        
        System.out.println("Calcular Costo terreno");
        System.out.println("El ancho del terrreno es de: "+epsilon.getAncho()+" m" +"\nEl largo del terreno es de: "+epsilon.getLargo()+" m"
                                      +"\nEl área del terreno es de: "+epsilon.getArea()+" m2" + "\nEl valor por metro cuadrado del terreno es de: "+ epsilon.getValorMetroCuadrado()+" usd" 
                                      +"\nEl costo del terreno es de: "+epsilon.getCosto_Terreno()+" usd");
    }
}