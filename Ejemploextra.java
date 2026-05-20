import java.util.Scanner;
public class Ejemploextra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa numero de alumnos: ");
        int alumnos = teclado.nextInt();
        double costodealumnos;
        double pagodecompañia;
        if (alumnos >= 100) {
            costodealumnos = 65;
            pagodecompañia = alumnos*costodealumnos;
        } else if (alumnos >= 50) {
            costodealumnos = 70;
            pagodecompañia = alumnos*costodealumnos;
        } else if (alumnos >= 30) {
            costodealumnos = 95;
            pagodecompañia = alumnos*costodealumnos;
        } else {
            pagodecompañia = 4000;
            costodealumnos = pagodecompañia / alumnos;
        }
        System.out.println("El pago a la compañia es de: " + pagodecompañia + "soles. ");
        System.out.println("Cada alumno debe pagar: " + costodealumnos + "soles. ");
    }
}
