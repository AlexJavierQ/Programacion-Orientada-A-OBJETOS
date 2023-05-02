

package Ejecutor;

import EquipoCelular.EquipoCelular;
public class Ejecutor {

    public static void main(String[] args) {
    EquipoCelular equipo1 = new EquipoCelular();
    
        equipo1.setSistemaOperativo("Android 12");
        equipo1.setTamañoPantalla((float)5.8);
        equipo1.setCostoInicial((float)499.99);
        equipo1.setDirMac("01:5b:e3:7d:13.5b.");
        equipo1.setInfIMEI("002565/00/739203/8");
        
        equipo1.ivaCostoInicial();
        equipo1.calcularCostoFinal();
        
        System.out.println("Sistema operativo: " + equipo1.getSistemaOperativo());
        System.out.println("Tamaño de la pantalla: " + equipo1.getTamañoPantalla()+" pulgadas");
        System.out.println("Costo inicial del equipo: $" + equipo1.getCostoInicial());
        System.out.println("Direccion Mac: " + equipo1.getDirMac());
        System.out.println("IMEI: " + equipo1.getInfIMEI());
        System.out.println("IVA: %" + equipo1.getIva() + "\n");
        System.out.print("Costo final del equipo: $" + equipo1.getCostoFinal());
    }
}
