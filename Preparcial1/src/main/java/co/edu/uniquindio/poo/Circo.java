package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Circo {
    private String nombre;
    private List<Artista> listArtistas;
    private List<Acto> listActos;
    private List<Funcion> listFunciones;
    private List<Cliente> listClientes;


    public Circo(String nombre) {
        this.nombre = nombre;
        this.listArtistas = new ArrayList<Artista>();
        this.listActos = new ArrayList<Acto>();
        this.listFunciones = new ArrayList<Funcion>();
        this.listClientes = new ArrayList<Cliente>();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre ( String nombre){
        this.nombre = nombre;
    }

    public List<Artista> getListArtistas() {
        return listArtistas;
    }

    public void setListArtistas(List<Artista> listArtistas) {
        this.listArtistas = listArtistas;
    }

    public List<Acto> getListActos() {
        return listActos;
    }

    public void setListActos(List<Acto> listActos) {
        this.listActos = listActos;
    }

    public List<Funcion> getListFunciones() {
        return listFunciones;
    }

    public void setListFunciones(List<Funcion> listFunciones) {
        this.listFunciones = listFunciones;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }
}
