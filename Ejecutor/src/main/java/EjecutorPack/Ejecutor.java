
package EjecutorPack;
import TerrenosPack.Terrenos;


public class Ejecutor {

    public static void main(String[] args) {
        Terrenos webito = new Terrenos();
        webito.setAncho(21);
        webito.setLargo(12);
        webito.setValorMetroCuadrado(4);
        webito.calcularArea();
        webito.calcularCosto_Terreno();
        
        System.out.println("Calcular Costo terreno");
        System.out.println("El ancho del terrreno es de: "+webito.getAncho()+" m" +"\nEl largo del terreno es de: "+webito.getLargo()+" m"
                                      +"\nEl área del terreno es de: "+webito.getArea()+" m2" + "\nEl valor por metro cuadrado del terreno es de: "+ webito.getValorMetroCuadrado()+" usd" 
                                      +"\nEl costo del terreno es de: "+webito.getCosto_Terreno()+" usd");
    }
}