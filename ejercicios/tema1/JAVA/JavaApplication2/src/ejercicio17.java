// nivel 1 (CalculoDescuento.java) calcular el precio final de una armadura de juego
// de 120 creditos aplicando una constante DESCUENTO = 0.15 (15%).abstract 
       
    import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {

        final double DESCUENTO = 0.15;
        double precio = 120;

        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("Precio original: " + precio + " créditos");
        System.out.println("Descuento: " + descuentoAplicado + " créditos");
        System.out.println("Precio final: " + precioFinal + " créditos");
    }
}



 