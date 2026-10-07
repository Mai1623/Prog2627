//NIVEL 2 (SimuladorCrono.java) dado un total de segundos (ej. 3725), utilizar
    //    operadores aritmeticos y de momdulo (/ y %) para descomponerlo y mostrar en
//pantalla cuantas horas, minutos y segundos exactos representa.
    import java.util.Scanner;
public class ejercicio171 {

    public static void main(String[] args) {

        int totalSegundos = 3725;

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}