/*
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. 
Si el peso es menor de 5 kg y la región es "local", el costo es de $5. 
Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". 
Para cualquier otro caso, el costo es de $15.
 */
package ejerciciosresueltostaller6;
import java.util.Scanner;
public class Envío_Paquetes_03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double pesoPaquete;
        String region;
        System.out.println("Ingrese si la región es: local / nacional / otra");
        region = teclado.next();
        System.out.println("Ingrese el peso del paquete");
        pesoPaquete = teclado.nextDouble();
        if (pesoPaquete < 5 && region.equals("local")) 
            System.out.println("Costo de $5");
        else 
            if (pesoPaquete >=5 && pesoPaquete <= 10 && region.equals("nacional"))
                System.out.println("Costo de $10");
            else
                System.out.println("Costo de $15");
    }    
}
