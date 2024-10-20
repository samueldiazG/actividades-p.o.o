/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emisora.entidades;

/**
 *
 * @author asus
 */
public class frecuencia {
    private String tipodefrecuencia;
    private int IDdelafrecuencia;
    private double potencia;
    private double alcance;

    public frecuencia(String tipodefrecuencia, int IDdelafrecuencia, double potencia, double alcance) {
        this.tipodefrecuencia = tipodefrecuencia;
        this.IDdelafrecuencia = IDdelafrecuencia;
        this.potencia = potencia;
        this.alcance = alcance;
    }
    public String gettipodefrecuencia(){
        return tipodefrecuencia;
    }
    public void settipodefrecuencia(String tipodefrecuencia){
        this.tipodefrecuencia= tipodefrecuencia;
    }
    public int getIDdelafrecuencia(){
        return IDdelafrecuencia;
    }
    public void setIDdelafrecuencia(int IDdelafrecuencia){
        this.IDdelafrecuencia= IDdelafrecuencia;
    }
    public double getpotencia(){
        return potencia;
    }
    public void setpotencia(double potencia){
        this.potencia= potencia;
    }
    public double getalcance(){
        return alcance; 
    }
    public void setalcance(double alcance){
        this.alcance= alcance;
    }
}
