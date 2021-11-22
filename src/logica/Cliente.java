
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private String esAlergico;
    private String requiereAtencionEspecial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int num_cliente, String nombre_perro, String raza, String color, String esAlergico, String requiereAtencionEspecial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.esAlergico = esAlergico;
        this.requiereAtencionEspecial = requiereAtencionEspecial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public String getRequiereAtencionEspecial() {
        return requiereAtencionEspecial;
    }

    public void setRequiereAtencionEspecial(String requiereAtencionEspecial) {
        this.requiereAtencionEspecial = requiereAtencionEspecial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    

    
    
    
}
