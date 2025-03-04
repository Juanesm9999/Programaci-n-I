package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia_Rq02 {

    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia_Rq02(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public boolean verificarNinio(Ninio ninio) {
        boolean existe = true;
        for (Ninio ninios : listNinios) {
            if (ninios.getID().equals(ninio.getID())) {
                existe = false;
            }
        }
        return existe;
    }

    public void almacenarNinio(Ninio ninio) {
        if (verificarNinio(ninio)){
            listNinios.add(ninio);
            System.out.println("Niño almacenado con exito");
        }else{
            System.out.println("No se pudo almacenar niño");

        }
    }


    public void eliminarNinio(String ID) {
        Boolean ninioEliminar  = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)) {
                listNinios.remove(i);
            ninioEliminar = true;
            break;
            }
        }
    }


    public void actualizarNinio(String ID, Ninio ninio) {
        Boolean ninioActualizar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if (listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                ninioActualizar = true;
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "Guarderia_Rq02{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        listNinios = listNinios;
    }
}