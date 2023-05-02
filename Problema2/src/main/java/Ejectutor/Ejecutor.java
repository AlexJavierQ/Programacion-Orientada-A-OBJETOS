

package Ejectutor;

import EquivalentePack.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {
         EquivalenteHora gamma = new EquivalenteHora();
        gamma.setHoras(23);
        gamma.calcularMinutos();
        gamma.calcularSegundos();
        gamma.calcularDias();
  
        System.out.println("Convertidor-"+ "\n"+gamma.getHoras()+ " horas son "+ gamma.getMinutos()+" minutos"
                                     + "\n"+gamma.getHoras()+ " horas son "+ gamma.getSegundos()+"Segundos"  
                                      + "\n"+gamma.getHoras()+ " horas son "+ gamma.getDias()+" Dias"  );
    }
}
