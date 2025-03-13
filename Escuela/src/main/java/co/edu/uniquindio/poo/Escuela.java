package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre, id;
    private List<Docente> listDocentes;
    private List<Materia> listMaterias;
    private List<Nota> listNotas;
    private List<Estudiante> listEstudiantes;


    public Escuela(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listDocentes = new ArrayList<>();
        this.listMaterias = new ArrayList<>();
        this.listNotas = new ArrayList<>();
        this.listEstudiantes = new ArrayList<>();
    }

    public void resgistrarDocente(Docente docente) {
        listDocentes.add(docente);
    }

    public void registrarMateria(Materia materia) {
        listMaterias.add(materia);
    }

    public void registrarNota(Nota nota) {
        listNotas.add(nota);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        listEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Docente> getListDocentes() {
        return listDocentes;
    }

    public void setListDocentes(List<Docente> listDocentes) {
        this.listDocentes = listDocentes;
    }

    public List<Materia> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(List<Materia> listMaterias) {
        this.listMaterias = listMaterias;
    }

    public List<Nota> getListNotas() {
        return listNotas;
    }

    public void setListNotas(List<Nota> listNotas) {
        this.listNotas = listNotas;
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", listDocentes=" + listDocentes +
                ", listMaterias=" + listMaterias +
                ", listNotas=" + listNotas +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}
