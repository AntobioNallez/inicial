/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package biblioteca;

import items.Item;
import items.Libro;
import items.Revista;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Antonio
 */
public class Biblioteca {

    private ArrayList<Item> prueba;
    private Integer key;

    private int numSecciones;
    private String nombre;
    private String direccion;
    private int numPlazas;
    protected HashMap<Integer, Item> fondo;
    private int numItems;
    
    //Hacer cambios mapa con String e item
    
    public Biblioteca(int numSecciones, String nombre, String direccion, int numPlazas, int numItems) {
        this.numSecciones = numSecciones;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numPlazas = numPlazas;
        this.fondo = new HashMap<> ();
        this.numItems = numItems;
    }

    public void altaItem() {
        short h = 0;
        Item i = new Libro("JoseLuis", h, direccion, nombre, true, nombre);
        fondo.put(numItems + 1, i);
        numItems++;
        // Item i2 = new Revista(nombre, h, direccion, nombre, true, nombre);
    }

    public void bajaItem(int num) {
        key = num;
        if (fondo.containsKey(key)) {
            fondo.remove(key);
        } else {
            System.out.println("No existe un objeto con ese id");
        }
    }

    public String listadoLibros() {
        prueba = new ArrayList<>();
        for (Item value : fondo.values()) {
            if (value instanceof Libro) {
                prueba.add(value);
            }
        }
        return prueba.toString();
    }

    public String listadoRevistas() {
        prueba = new ArrayList<>();
        for (Item value : fondo.values()) {
            if (value instanceof Libro) {
                prueba.add(value);
            }
        }
        return prueba.toString();
    }

    public String listadoFondo() {
        return fondo.toString();
    }

    public void listadoPorTema(String tema) {
        
    }

    public HashMap copiaFondo() {
        return this.fondo;
    }
}
