package co.edu.uniquindio.poo;

public class ejercicio2 {
    //sumar los primeros números naturales
    public static int sumarNumeros(int numero) {
        int i = 1;
        int suma = 0;
        while (i <= numero) {
            suma += i;
            i++;
        }
        return suma;
    }

}
    public static void main(String[] args) {
    System.out.println(sumaNumeros());
    }

