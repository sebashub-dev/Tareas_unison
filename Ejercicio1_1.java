/*
1. Elaborar un programa en Java que imprima el costo de un pedido de un artículo del cual se tiene
la descripción, la cantidad pedida y el precio unitario. Si la cantidad pedida es mayor a 50 unidades,
 se hace un descuento de 15%.
*/

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean PASS = true;
        String yn;
        int i = 0;
        double descuent = 0;
        double sub_total, total;

        String[][] articulos = {
                {"Raspberry Pi 4 (4GB RAM)", "1800", "Microcomputadora ideal para proyectos de automatización"},
                {"Multímetro digital UNI-T UT61E", "950", "Herramienta precisa para diagnóstico electrónico avanzado"},
                {"SSD NVMe Kingston 1TB", "1350", "Almacenamiento ultrarrápido para simulaciones y IA"},
                {"Fuente conmutada 24V 10A", "620", "Alimentación robusta para motores y drivers"},
                {"Tester USB-C multifunción", "280", "Valida carga, voltaje y protocolos en tiempo real"}
                };

        while(PASS) {

            System.out.println("Catalogo de articulos, porfavor escoja un articulo:");
            System.out.printf("1. %s%n2. %s%n3. %s%n4. %s%n5. %s%n", articulos[0][0], articulos[1][0], articulos[2][0], articulos[3][0], articulos[4][0]);
            System.out.println("Articulo: ");
            String select = leer.next();
            System.out.println("||||||||DESCRIPCION|||||||||");
            switch (select) {
                case "1":
                    System.out.printf("-%s-%n%s%nPrecio unitario: %d%n", articulos[0][0], articulos[0][2], Integer.parseInt(articulos[0][1]));
                    PASS = false;
                    i = 0;
                    break;
                case "2":
                    System.out.printf("-%s-%n%s%nPrecio unitario: %d%n", articulos[1][0], articulos[1][2], Integer.parseInt(articulos[1][1]));
                    PASS = false;
                    i = 1;
                    break;
                case "3":
                    System.out.printf("-%s-%n%s%nPrecio unitario: %d%n", articulos[2][0], articulos[2][2], Integer.parseInt(articulos[2][1]));
                    PASS = false;
                    i = 2;
                    break;
                case "4":
                    System.out.printf("-%s-%n%s%nPrecio unitario: %d%n", articulos[3][0], articulos[3][2], Integer.parseInt(articulos[3][1]));
                    PASS = false;
                    i = 3;
                    break;
                case "5":
                    System.out.printf("-%s-%n%s%nPrecio unitario: %d%n", articulos[4][0], articulos[4][2], Integer.parseInt(articulos[4][1]));
                    PASS = false;
                    i = 4;
                    break;
                default:
                    System.out.println("Articulo no encontrado, porfavor escriba el numero de un artiulo valido");
                    break;

            }
            System.out.println("||||||||||||||||||||||||||||");
            if(PASS == false){
                do{
                    System.out.printf("%nQuieres comprar este articulo?(s/n)%n");
                    leer.nextLine();
                    yn = leer.next();
                } while(!"n".equals(yn) && !"s".equals(yn));

                if(yn.equals("s")){
                    System.out.println("en la compra de mas de 50 unidades te damos el 15% de descuento");
                    System.out.println("Cuantas unidades de este articulo deseas?");
                    int cant = leer.nextInt();

                    sub_total = cant * Integer.parseInt(articulos[i][1]);

                    System.out.printf("Subtotal: %.2f%n", sub_total);
                    if(cant > 50){
                        descuent = 0.15;
                        descuent = sub_total * descuent;
                        System.out.printf("Descuento: %.2f%n", descuent);
                    }
                    total = sub_total - descuent;
                    System.out.printf("Total: %.2f%n", total);

                    break;
                }
                PASS = true;
            }


        }


    }
}
