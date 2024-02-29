/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;


/**
 *
 * @author Diurno
 */
public abstract class Item {
    
    private String titulo;
    private short paginas;
    private String editorial;
    private String fechaPublic;
    public boolean estaPrestado;
    private String tematica;

    public Item(String titulo, short paginas, String editorial, String fechaPublic, boolean estaPrestado, String tematica) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublic = fechaPublic;
        this.estaPrestado = estaPrestado;
        this.tematica = tematica;
    }
    
    public void tomarItem() {
        
    }

    @Override
    public String toString() {
        return titulo;
    }
}
