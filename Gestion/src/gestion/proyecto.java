/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author danir
 */
public class proyecto {
    public String Nombre;
    public String fechaCreacion;
    public String fechaEntrega;
    public boolean estado;

    public proyecto(String Nombre, String fechaCreacion, String fechaEntrega, boolean estado) {
        this.Nombre = Nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "proyecto{" + "Nombre=" + Nombre + ", fechaCreacion=" + fechaCreacion + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + '}';
    }
    
    
    
}
