
package pruebas;

public class TEST {
    public static void main(String[] args) {
        
        Transporte transporteLunes = new Transporte();
        
        transporteLunes.setCoste();
        
        System.out.println("El coste del viaje es: "+transporteLunes.getCoste());
    }
}

class Transporte {
    
    int id;
    private double coste;
    int tiempo;
    
    void setCoste() {
        //Calculos complejos
        coste = calculoCosteTaxi()+calculoCosteMetro();
    }
    
    double getCoste() {
        return coste;
    }
    
    private double calculoCosteTaxi(){
        // Realiza calculos
        return 40.0;
    }
    
    private double calculoCosteMetro() {
        // Realiza calculos
        return 5.0;
    }
    
    void reservar() {
        System.out.println("Reserva realizada.");
    }
}


