package aclase;

/**
 * Created with IntelliJ IDEA.
 * User: Gustavo
 * Date: 10/10/14
 * Time: 19:44
 * To change this template use File | Settings | File Templates.
 */
class Clase {
     int nalumnos;
     int preciohora;
     int horas;
     int ingreso(){
        return nalumnos * horas * preciohora;
     }

     int sueldoprof;
     int ganancia (){
         return ingreso() - sueldoprof;
     }
     int horasrequeridas (int objetivoanual) {
         return  ( objetivoanual + sueldoprof) / preciohora;
     }
}
public class DemoClase {
    public static void main(String args []) {
        Clase yogaclase = new Clase();
        yogaclase.horas = 40;
        yogaclase.nalumnos = 10;
        yogaclase.preciohora = 99;
        yogaclase.sueldoprof = 4000;
        System.out.println("Ingreso: " + yogaclase.ingreso());
        System.out.println("Ganancia: " + yogaclase.ganancia());
        System.out.println("Horas requeridas para el objetivo anual (100000): " + yogaclase.horasrequeridas(100000));
    }



}
