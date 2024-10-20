/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emisora.entidades;

public class programa {
    private String nombrepr;
    private String horario;
    private String tipprograma;
    private String genmusical;
    private String presentador;
    private String invitados;

    public programa(String nombrepr, String horario, String tipprograma, String genmusical, String presentador, String invitados) {
        this.nombrepr = nombrepr;
        this.horario = horario;
        this.tipprograma = tipprograma;
        this.genmusical = genmusical;
        this.presentador = presentador;
        this.invitados = invitados;
    }
    public String getnombrepr(){
        return nombrepr;
    }
    public void setnombrepr(String nombrepr){
        this.nombrepr= nombrepr;
                
    }
    public String gethorario(){
        return horario;
    }
    public void sethorario( String horario){
        this.horario= horario;
    }
    public String gettipprograma(){
        return tipprograma;
        
    }
    public void settipprograma( String tipprograma){
        this.tipprograma= tipprograma;
        
    }
    public String getgenmusical(){
        return genmusical;
    }
    public void setgenmusical(String genmusical){
        this.genmusical= genmusical;
    }
    public String getpresentador(){
        return presentador;
    }
    public void setpresentador(String presentador){
        this.presentador= presentador;
        
    }
    public String getinvitados(){
        return invitados;
    }    
    public void setinvitados( String invitados){
        this.invitados= invitados;
    }
    
    
}
