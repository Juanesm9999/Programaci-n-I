package co.edu.uniquindio.poo;

public class Ejercicio1 {

    //imprimir los primero números naturales

    public static String numerosNaturales() {
        String numeros = "";
        for (int i = 0; i <= 10; i++) {
            numeros += "El número es: " + i + "\n" ;

        }

        return numeros;
    }

    public static void main(String[] args) {
        System.out.println(numerosNaturales());
    }
}


