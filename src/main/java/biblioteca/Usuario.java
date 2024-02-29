/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;


/**
 *
 * @author Antonio
 */
public class Usuario {
    private String nombreUsuario;
    private String dni;
    private int numSocio;
    private int telefono;
    private boolean estaSancionado = false;
    
    private ArrayList<items.Item> librosPosesion;

    public String getLibrosPosesion() {
        return librosPosesion.toString();
    }
    
    public String tomarItem(items.Item it) {
        if (librosPosesion.size() == 5 || estaSancionado) {
            
            return "No puedes coger libros";
        } else if (it.estaPrestado) {
            return "El libro ya ha sido prestado a otra persona";
        } else {
            librosPosesion.add(it);
            it.estaPrestado = true;
            return "Libro disponible y añadido al usuario";
        }
    }
    
    public void devolverItem(items.Item item) {
        if (librosPosesion.contains(item)) {
            System.out.println("Libro devuelto correctamente");
            librosPosesion.remove(item);
            item.estaPrestado = false;
        }
    }
    
    public boolean estaSancionado() {
        return estaSancionado;
    }
    
    public String listadoItemsPrestado() {
        return librosPosesion.toString();
    }
}
