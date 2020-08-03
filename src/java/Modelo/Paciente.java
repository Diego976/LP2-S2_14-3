/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author w10
 */
public class Paciente {
     private int idpaciente;
    private String nombres;
    private String apellido;
    private String Enfermedad;
    private int Tiempo;

    public Paciente() {
    }

    public Paciente(int idpaciente, String nombres, String apellido, String Enfermedad, int Tiempo) {
        this.idpaciente = idpaciente;
        this.nombres = nombres;
        this.apellido = apellido;
        this.Enfermedad = Enfermedad;
        this.Tiempo = Tiempo;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }
    
    
    
    
}
