package gestion;


import gestion.proyecto;
import java.util.ArrayList;

public class usuarios {
  public String Nombre;
  public String contraseña;
  public String correo;
  public ArrayList<proyecto> proyectos;


    public usuarios(String Nombre, String contraseña, String correo) {
        this.Nombre = Nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.proyectos = new ArrayList<>();
    }

    public ArrayList<proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "usuarios{" + "Nombre=" + Nombre + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + '}';
    }
  
    public void crear(String nombre, String contraseña,String correo){
        
    }
    
    
    public void agregarProyecto(proyecto p) {
        proyectos.add(p);
    }
    
     public void eliminarProyecto(proyecto p) {
        proyectos.remove(p);
    }

}