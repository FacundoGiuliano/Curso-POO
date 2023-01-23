
package pruebas;


public class Video_11 {
    public static void main(String[] args) {
        Empleado[] losEmpleados = new Empleado[5];
        losEmpleados[0] = new Empleado();
        losEmpleados[1] = new Empleado();
        losEmpleados[2] = new Empleado();
        losEmpleados[3] = new Director();
        losEmpleados[4] = new Empleado();
        
        for(Empleado obj: losEmpleados) {
            obj.trabaja();
        }
        
    }
}
class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    public void trabaja() {
        System.out.println("Realizo las tareas tipicas de un empleado.");
    }
}

class Director extends Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private double incentivo;
    public void trabaja() {
        System.out.println("Realizo las tareas tipicas de un director.");
    }
}