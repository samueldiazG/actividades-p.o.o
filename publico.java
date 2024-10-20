/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emisora.entidades;

/**
 *
 * @author asus
 */
public class publico {
   private String genrooyentes;
    private int edadoyentes; 

    public publico(String genrooyentes, int edadoyentes) {
        this.genrooyentes = genrooyentes;
        this.edadoyentes = edadoyentes;
    }
      public String getgenrooyentes(){
    return genrooyentes;
}
      public void set( String genrooyentes){
          this.genrooyentes= genrooyentes;
      }
      public int getedadoyentes(){
          return edadoyentes;
      }
      public void setedadoyentes(int edadoyentes){
          this.edadoyentes= edadoyentes;
      }
      
}
  
