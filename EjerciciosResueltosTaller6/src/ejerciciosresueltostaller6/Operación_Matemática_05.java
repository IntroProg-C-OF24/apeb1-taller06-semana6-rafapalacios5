/*
Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. 
Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; 
si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
package ejerciciosresueltostaller6;
import java.util.Scanner;
public class Operación_Matemática_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int operacion;
        System.out.println("Ingrese un número del 1 al 4");
        operacion = teclado.nextInt();
        switch (operacion){
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicación");
                break;
            case 4:
                System.out.println("División");
                break;
            default:
                System.out.println("El número ingresado no pertenece a ninguna operación matemática básica");
        }                 
    }  
}
