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
public class directorio extends creacion {

    public ArrayList<archivo> lista_archivos = new ArrayList<>();

    public directorio(String nombre) {
        super(nombre);
    }

    public ArrayList<archivo> getLista_archivos() {
        return lista_archivos;
    }

    public void setLista_archivos(ArrayList<archivo> lista_archivos) {
        this.lista_archivos = lista_archivos;
    }

    @Override
    public String toString() {
        return  this.getNombre();
    }

}
