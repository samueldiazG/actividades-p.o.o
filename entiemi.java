/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emisora.entidades;
public class entiemi {
    private String nombredelaemisora;
    private String programacion;
    private String ciudad;
    private String slogan;

    public entiemi(String nombredelaemisora, String programacion, String ciudad, String slogan) {
        this.nombredelaemisora = nombredelaemisora;
        this.programacion = programacion;
        this.ciudad = ciudad;
        this.slogan = slogan;
    }
    public String getnombredelaemisora(){
            return nombredelaemisora;
    }
    public void setnombredelaemisora(String nombredelaemisora){
        this.nombredelaemisora=nombredelaemisora;
    }
    public String getprogramacion(){
        return programacion; 
    }
    public void setprogramacion(String programacion){
        this.programacion= programacion;
    }
    public String getciudad(){
        return ciudad;
    }
    public void setciudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getslogan(){
    return slogan;
}
    public void setslogan(String slogan){
      this.slogan= slogan;  
    }
    
}
