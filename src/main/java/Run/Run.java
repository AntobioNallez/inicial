/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import biblioteca.Biblioteca;

/**
 *
 * @author Diurno
 */
public class Run {
    public static void main(String[] args) {
        biblioteca.Biblioteca b = new Biblioteca(0, "cu", "Cu", 0, 0);
        b.altaItem();
        System.out.println(b.listadoFondo());
        b.bajaItem(2);
        System.out.println(b.listadoLibros());
    }
}
