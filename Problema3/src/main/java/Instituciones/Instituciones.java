
package Instituciones;


public class Instituciones {
     private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    private int gastos;
    private int presupuesto;
    
    
    public void setNombre(String nombre) {
         this.nombre = nombre;
    }
      public String getNombre() {
         return nombre;
    }   
      
      
       public void setTipo(String tipo) {
         this.tipo = tipo;
    }
      public String getTipo() {
         return tipo;
      }
      
      
            public void setAlumnos(int alumnos) {
         this.alumnos = alumnos;
    }
      public int getAlumnos() {
         return alumnos;   
}
                  public void setDocentes(int docentes) {
         this.docentes = docentes;
    }
      public int getDocentes() {
         return docentes;
      }
        public void setSedes(int sedes) {
         this.sedes = sedes;
    }
      public int getSedes() {
         return sedes; 
      
}
            public void setGastos(int gastos) {
         this.gastos = gastos;
    }
      public int getGastos() {
         return gastos; 
      }
       public void setPresupuestos(int presupuesto) {
         this.presupuesto = presupuesto;
    }
      public int getPresupuesto() {
         return presupuesto; 
      }
      
      public void CalcularPresupuesto(){ 
          presupuesto = alumnos*gastos;
      }
}
