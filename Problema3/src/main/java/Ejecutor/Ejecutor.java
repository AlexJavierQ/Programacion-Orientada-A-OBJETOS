/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;

import Instituciones.Instituciones;

public class Ejecutor {
    public static void main(String[] args) {
         Instituciones delta = new Instituciones();
        delta.setNombre("Tecnologico de Loja");
        delta.setTipo("Tecnologico");
        delta.setAlumnos(4);
        delta.setDocentes(2);
        delta.setSedes(2);
         delta.setGastos(9);
         delta.CalcularPresupuesto();
        System.out.println(" PROYECTO3"+"\n"+"Nombre de la institucion: "+delta.getNombre()+"\nTipo de institucion: "+delta.getTipo()
                +"\nNumero de almunos: "+ delta.getAlumnos()+"\nNumero de docentes: "+ delta.getDocentes()+ "\nNumero de sedes: "+delta.getSedes()
                +"\nGastos proyectados por estudiante: "+ delta.getGastos()+"\nPresupuesto: "+ delta.getPresupuesto()+" usd" );
    }
}
