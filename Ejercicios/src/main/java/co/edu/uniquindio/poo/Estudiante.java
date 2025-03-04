package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Scanner;


public class Estudiante {
    private String numId, nombre, apellido, correo, telefono;
    private int edad;

    public Estudiante(String id, String nombre, String apellido, String correo, String telefono, int edad) {
        this.numId = numId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getnumId() { return numId; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public int getEdad() { return edad; }

    public void setCorreo(String correo) { this.correo = correo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEdad(int edad) { this.edad = edad; }
    
}

class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(String numId) {
        for (Estudiante e : estudiantes) {
            if (e.getnumId().equals(numId)) return e;
        }
        return null;
    }

    public boolean actualizarEstudiante(String numId, String correo, String telefono, int edad) {
        Estudiante e = buscarEstudiante(numId);
        if (e != null) {
            e.setCorreo(correo);
            e.setTelefono(telefono);
            e.setEdad(edad);
            return true;
        }
        return false;
    }

    public boolean eliminarEstudiante(String id) {
        return estudiantes.removeIf(e -> e.getnumId().equals(id));
    }

    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}


class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionEstudiantes gestor = new GestionEstudiantes();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Listar estudiantes");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("# ID: ");
                    String numId = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    gestor.agregarEstudiante(new Estudiante(numId, nombre, apellido, correo, telefono, edad));
                    System.out.println("Estudiante agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese ID: ");
                    numId = sc.nextLine();
                    Estudiante estudiante = gestor.buscarEstudiante(numId);
                    System.out.println(estudiante != null ? estudiante : "Estudiante no encontrado.");
                    break;
                case 3:
                    System.out.print("Ingrese ID: ");
                    numId = sc.nextLine();
                    System.out.print("Nuevo correo: ");
                    correo = sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    telefono = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();
                    boolean actualizado = gestor.actualizarEstudiante(numId, correo, telefono, edad);
                    System.out.println(actualizado ? "Actualización exitosa." : "Estudiante no encontrado.");
                    break;
                case 4:
                    System.out.print("Ingrese ID: ");
                    numId = sc.nextLine();
                    boolean eliminado = gestor.eliminarEstudiante(numId);
                    System.out.println(eliminado ? "Estudiante eliminado." : "Estudiante no encontrado.");
                    break;
                case 5:
                    gestor.listarEstudiantes();
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}


