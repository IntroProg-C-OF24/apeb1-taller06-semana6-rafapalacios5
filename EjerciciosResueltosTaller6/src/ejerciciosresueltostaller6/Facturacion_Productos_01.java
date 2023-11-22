/*
Problema 1
 */
package ejerciciosresueltostaller6;
import java.util.Scanner;
public class Facturacion_Productos_01 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      double producto1, producto2, costoProducto1, costoProducto2, costoTotalProducto1, costoTotalProducto2, subTotal, descuento1, descuento2, envio, subTotalIva, montoFactura1, montoFactura2;
        System.out.println("Ingrese la cantidad del producto 1");
        producto1 = teclado.nextDouble();
        System.out.println("Ingrese el costo del producto 1");
        costoProducto1 = teclado.nextDouble();
        System.out.println("Ingrese la cantidad del producto 2");
        producto2 = teclado.nextDouble();
        System.out.println("Ingrese el costo del producto 2");
        costoProducto2 = teclado.nextDouble();
        System.out.println("Envio");
        envio = teclado.nextDouble();
        costoTotalProducto1 = producto1 * costoProducto1;
        costoTotalProducto2 = producto2 * costoProducto2;
        subTotal = (costoTotalProducto1 + costoTotalProducto2);
        subTotalIva = ((costoTotalProducto1 + costoTotalProducto2)* 0.12) + subTotal;
        descuento1 = (subTotal * 0.20);
        descuento2 = (subTotal * 0.050);
        montoFactura1 = (subTotal + (subTotal - descuento1)*0.12)+envio;
        montoFactura2 = (subTotal + (subTotal - descuento2)*0.12);
        System.out.println("Costo Producto 1: " + costoTotalProducto1);
        System.out.println("Costo Producto 2: " + costoTotalProducto2);
        System.out.println("SUBTOTAL: " + subTotal);
        System.out.println("Subtotal + IVA: " + subTotalIva);
        if (subTotalIva > 1000) {
            descuento1 = subTotalIva * 0.20;
            subTotalIva = subTotalIva - descuento1;
            System.out.println("Su descuento es: " + descuento1);
        } else {
            descuento2 = subTotalIva * 0.05;
            subTotalIva = subTotalIva - descuento2;
            System.out.println("Su descuento es: " + descuento2);
        }
        if (subTotalIva > 5000) {
            envio = 0; 
        }
        
    }
    
}
