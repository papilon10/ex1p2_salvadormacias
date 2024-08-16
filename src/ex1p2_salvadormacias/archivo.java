/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class archivo extends creacion {

    public String contenido;

    public archivo(String contenido, String nombre) {
        super(nombre);
        this.contenido = contenido;
    }

    public archivo(String nombre) {
        super(nombre);
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}
