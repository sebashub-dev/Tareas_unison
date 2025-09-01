/*
3. Elaborar un programa en Java que lea los datos de un estudiante
(nombre y tres calificaciones parciales) e imprima el nombre y la calificación final de acuerdo
con lo siguiente: para aprobar el curso debe tener 60 o más en cada una de las tres calificaciones,
la calificación final será el promedio. En caso de haber reprobado uno o más exámenes ordinarios,
la calificación final será NA (No Acreditado).
 */


import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] calificaciones = {0, 0, 0};
        int suma = 0;

        System.out.println("Cual es tu nombre");
        String name = leer.next();

        for(int i = 0; i < 3; i++){
            System.out.printf("Dame tu calificacion del parcial %d%n", i+1);
            int calif = leer.nextInt();
            calificaciones[i] = calif;
        }
        for(int i = 0; i < 3; i++){
            if(calificaciones[i] < 60){
                System.out.printf("Reprobaste en el parcial %d%n", i+1);
                System.out.println("Necesitas tener 60 o mas en cada parcial");
                System.out.println("Calificacion final: NA");
                System.exit(0);
            }
            suma += calificaciones[i];
        }
        double promedio = suma / 3;
        System.out.printf("Calificacion final: %.2f%n", promedio);

    }
}
