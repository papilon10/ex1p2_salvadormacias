/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_salvadormacias;

import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class usuario {

    private String nombre;
    public ArrayList lista_creaciones = new ArrayList<>();

    public usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getLista_creaciones() {
        return lista_creaciones;
    }

    public void setLista_creaciones(ArrayList lista_creaciones) {
        this.lista_creaciones = lista_creaciones;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", lista_creaciones=" + lista_creaciones + '}';
    }

}
