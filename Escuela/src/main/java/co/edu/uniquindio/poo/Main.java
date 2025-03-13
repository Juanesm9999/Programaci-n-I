package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Escuela escuela = new Escuela("RUU", "123567");

        int opcion = 0;

        while(opcion != 8){
        System.out.println("\nMenú interactivo de la escuela");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Agregar Notas");
        System.out.println("3. Mostrar Notas");
        System.out.println("4. Mostrar Promedio");
        System.out.println("5. Actualizar Estudiante");
        System.out.println("6. Motrar Estudiante");
        System.out.println("7. Eliminar Estudiante");
        System.out.println("8. Salir");
        }
    }
}