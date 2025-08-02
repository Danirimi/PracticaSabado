/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import java.util.ArrayList;

/**
 *
 * @author danir
 */
public class GestionUsuario {
     public static ArrayList<usuarios> usuariosRegistrados = new ArrayList<>();

   

    public static void registrarUsuario(usuarios nuevo) {
        usuariosRegistrados.add(nuevo);
    }
    
     public static usuarios buscarUsuario(String nombre) {
        for (usuarios u : usuariosRegistrados) {
            if (u.getNombre().equals(nombre)) {
                return u;
            }
        }
        return null;
    }
    
}
