/*
Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo.
Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 */
package ejerciciosresueltostaller6;
import java.util.Scanner;
public class Clasificación_Triángulo_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, resultado;
        System.out.println("Ingrese la primera longitud");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda longitud");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera longitud");
        lado3 = teclado.nextDouble();
        resultado = lado1 + lado2;
        if (lado1 == lado2 && lado2 == lado3) 
            System.out.println("Triangulo Equilatero");
        else 
            if (lado1 == lado2 && lado2 != lado3)
                System.out.println("El triángulo es Isóceles");
            else 
                if (lado1 != lado2 && lado2 != lado3) 
                    System.out.println("El triángulo es Escaleno");
                else 
                    if (resultado < lado3) 
                        System.out.println("No es un triangulo");
        }

    }
