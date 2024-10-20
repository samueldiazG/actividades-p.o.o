/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emisora.entidades;

/**
 *
 * @author asus
 */
public class presentador {
     private String nombre;
    private int id;
    private String genero;
    private int edad;

    public presentador(String nombre, int id, String genero, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.genero = genero;
        this.edad = edad;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre= nombre;
    }
    public int getid(){
        return id;
    }
     public void setid(int id){
         this.id= id;
     }
     public String getgenero(){
         return genero;
     }
     public void setgenero(String genero){
         this.genero= genero;
     }
     public int getedad(){
         return edad;
         
     }
     
    
}
