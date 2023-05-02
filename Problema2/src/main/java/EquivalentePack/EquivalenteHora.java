package EquivalentePack;

public class EquivalenteHora {
   private int  horas;
    private int minutos;
    private int segundos;
    private double dias;
    
    public void setHoras(int horas) {
         this.horas = horas;
    }
      public int getHoras() {
         return horas;
    }   

       public void setMinutos(int minutos) {
         this.minutos = minutos;
    }
      public int getMinutos() {
         return  minutos;
    }   
      
       public void setSegundos(int segundos) {
         this.segundos = segundos;
    }
      public int getSegundos() {
         return  segundos;
    }   
            
       public void setDias(double dias) {
         this.dias = dias;
    }
      public double getDias() {
         return dias;
         }
      
      
     
      public void calcularMinutos(){ 
          minutos = (int) (horas*60);
      }
    public void calcularSegundos(){
        segundos= (int) (horas*3600);
    }
    public void calcularDias(){
         dias= (double) horas/24;
    }


}
