/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

/**
 *
 * @author Diurno
 */
public class Libro extends Item{
    private String autor;
    private String ISBN;

    public Libro(String titulo, short paginas, String editorial, String fechaPublic, boolean estaPrestado, String tematica) {
        super(titulo, paginas, editorial, fechaPublic, estaPrestado, tematica);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
