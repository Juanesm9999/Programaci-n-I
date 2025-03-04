package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Guarderia_Rq02 guarderia = new Guarderia_Rq02("pequeños gigantesñ.ñ");


        int opcion = 0;
        while (true) {
            System.out.println("\n Menu Interactivo de la guardería");
            System.out.println("1. Agregar Niño");
            System.out.println("2. Eliminar Niño");
            System.out.println("3. Actualizar Niño");
            System.out.println("4. Mostrar la lista de niños");
            System.out.println("5. Salir");



            System.out.print("Selecciona una pcion: ");

            if(opcion == 1) {
                System.out.println("Ingrese el nombre del niño");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del niño");
                String edad = scanner.nextLine();
                System.out.println("Ingrese el genero del niño");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del niño");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del niño");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del Acudiente del niño");
                String nombreAcudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del niño");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del niño");
                String ID = scanner.nextLine();


                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, nombreAcudiente, contactoAcudiente, ID);
                guarderia.almacenarNinio(ninio);

            }else if(opcion == 2) {
                System.out.println("Ingrese el número de ID del niño a eliminar");


            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del niño a actualizar");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del niño a actualizar");
                String edad = scanner.nextLine();
                System.out.println("Ingrese el genero del niño a actualizar");
                String genero = scanner.nextLine();
                System.out.println("Ingrese el documento del niño a actualizar");
                String documento = scanner.nextLine();
                System.out.println("Ingrese la alergia del niño a actualizar");
                String alergia = scanner.nextLine();
                System.out.println("Ingrese el nombre del Acudiente del niño a actualizar");
                String nombreAcudiente = scanner.nextLine();
                System.out.println("Ingrese el numero de contacto del acudiente del niño a actualizar");
                String contactoAcudiente = scanner.nextLine();
                System.out.println("Ingrese el ID del niño a actualizar");
                String ID = scanner.nextLine();


                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, nombreAcudiente, contactoAcudiente, ID);
                guarderia.actualizarNinio(IDActualizar, ninio);

            }
        }

    }
}


